package com.glean.guideBoxAccessLayer;

/**
 * Created by justi on 12/17/2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class GuideBoxAPIAccessorImpl implements GuideBoxAPIAccessor {

    @Autowired
    private URLBuilder urlBuilder;

    @Autowired
    private URLCaller urlCaller;

    @Override
    public String getShowByShowTitle(String apiKey, String title) throws IOException {
        String url = urlBuilder.buildUrlToGetShowByTitle(apiKey, title);
        return urlCaller.makeCall(url);
    }

    @Override
    public String getShowByTelevisionDatabaseShowId(String apiKey, String showId) throws IOException{
        String url = urlBuilder.buildUrlToGetShowByTelevisionDatabaseShowId(apiKey, showId);
        return urlCaller.makeCall(url);
    }

    @Override
    public String getShowByShowId(String apiKey, String showId) throws IOException{
        String url = urlBuilder.buildUrlToGetShowByShowId(apiKey, showId);
        return urlCaller.makeCall(url);
    }

    @Override
    public String getSeasonsByShowId(String apiKey, String showId) throws IOException{
        String url = urlBuilder.buildUrlToGetSeasonsByShowId(apiKey, showId);
        return urlCaller.makeCall(url);
    }

    @Override
    public String getEpisodesByShowAndSeasonId(String apiKey, String showId, int seasonNumber, int startingEpisode, int episodeCount, List<String> sources, String platform, boolean includedLinks, boolean chronologicalOrder) throws IOException{
        String url = urlBuilder.buildGetEpisodesByShowAndSeasonIdUrl(apiKey, showId, seasonNumber, startingEpisode, episodeCount, sources, platform, includedLinks, chronologicalOrder);
        return urlCaller.makeCall(url);
    }

    @Override
    public String getEpisodesByShowAndSeasonId(String apiKey, String showId, int seasonNumber, int startingEpisode, int episodeCount, List<String> sources, String platform, boolean includedLinks) throws IOException{
        return getEpisodesByShowAndSeasonId(apiKey, showId, seasonNumber, startingEpisode, episodeCount, sources, platform, includedLinks, true);
    }

    @Override
    public String getSimilarShowById(String apiKey, String showId) throws IOException{
        String url = urlBuilder.buildGetSimilarShowByIdUrl(apiKey, showId);
        return urlCaller.makeCall(url);
    }

    @Override
    public String getFreeUserStreamSources(String apiKey) throws IOException{
        String url = urlBuilder.buildGetFreeSourcesUrl(apiKey);
        return urlCaller.makeCall(url);
    }

    @Override
    public String getSubscriptionUserStreamSources(String apiKey) throws IOException{
        String url = urlBuilder.buildGetSubscriptionSourcesUrl(apiKey);
        return urlCaller.makeCall(url);
    }

    @Override
    public String getMovieByTheMovieDBShowId(String apiKey, String movieId) throws IOException{
        String url = urlBuilder.buildUrlToGetMovieByTheMovieDBShowId(apiKey, movieId);
        return urlCaller.makeCall(url);
    }

    @Override
    public String getMovieByMovieId(String apiKey, String movieId) throws IOException{
        String url = urlBuilder.buildUrlToGetMovieByMovieId(apiKey, movieId);
        return urlCaller.makeCall(url);
    }

    @Override
    public String getMovieByTitle(String apiKey, String movieName) throws IOException{
        String url = urlBuilder.buildUrlToGetMovieByTitle(apiKey, movieName);
        return urlCaller.makeCall(url);
    }

}

