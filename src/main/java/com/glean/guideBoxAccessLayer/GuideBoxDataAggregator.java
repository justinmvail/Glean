package com.glean.guideBoxAccessLayer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.glean.wrappers.EpisodesWrapper;
import com.glean.wrappers.SeasonsWrapper;
import com.glean.wrappers.UserStreamSourceWrapper;
import com.glean.guideBoxDataEntities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by justi on 12/25/2016.
 */
@Service
public class GuideBoxDataAggregator {

    @Value("${spring.datasource.url}")
    String dataSource;

    @Value("${apikey}")
    String apiKey;

    @Autowired
    private GuideBoxAPIAccessor accessor;

    @Autowired
    private ObjectMapper mapper;

    public Show fetchAndAssembleFullShowFromGuideBox(String showId) throws IOException {
        List<String> sources = new ArrayList<String>();
        sources.add("all");
        Show show = mapper.readValue(accessor.getShowByShowId(apiKey, showId), Show.class);
        SeasonsWrapper seasonsWrapper = mapper.readValue(accessor.getSeasonsByShowId(apiKey, showId), SeasonsWrapper.class);
        for(Season season : seasonsWrapper.getResults()) {
            EpisodesWrapper episodesWrapper = mapper.readValue(accessor.getEpisodesByShowAndSeasonId(
                    apiKey,
                    showId,
                    season.getSeasonNumber(),
                    0,
                    100,
                    sources,
                    "all",
                    true),
                    EpisodesWrapper.class);
            season.setEpisodes(episodesWrapper.getResults());
            show.addSeason(season);
        }
        return show;
    }

    public Movie fetchAndAssembleMovieFromGuideBox(String movieId) throws IOException {
        List<String> sources = new ArrayList<String>();
        sources.add("all");
        return mapper.readValue(accessor.getMovieByMovieId(apiKey, movieId), Movie.class);
    }

    public List<UserStreamSource> fetchAndAssembleFreeSources() throws IOException {
        List<String> sources = new ArrayList<>();
        sources.add("free");
        return mapper.readValue(accessor.getFreeUserStreamSources(apiKey), UserStreamSourceWrapper.class).getResults();
    }

    public List<UserStreamSource> fetchAndAssembleSubscriptionSources() throws IOException {
        List<String> sources = new ArrayList<>();
        sources.add("subscription");
        return mapper.readValue(accessor.getFreeUserStreamSources(apiKey), UserStreamSourceWrapper.class).getResults();
    }

}
