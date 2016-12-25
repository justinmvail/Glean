package com.glean.guideBoxMining;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.glean.entities.EpisodesWrapper;
import com.glean.entities.Season;
import com.glean.entities.SeasonsWrapper;
import com.glean.entities.Show;
import com.glean.guideBoxAccessLayer.GuideBoxAPIAccessor;
import com.glean.services.ShowRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by justi on 12/18/2016.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JsonToEntityToMongoTest {

    private final String API_KEY = "rKb2Votbq91OfF7vWvJtcn9Q18QNAUiQ";

    @Autowired
    private ShowRepo showRepo;

    @Autowired
    private MongoOperations mongoOperations;

    @Autowired
    private MongoTemplate mongoTemplate;


    @Test
    public void jsonToObjectThenCommitToDB() throws IOException {
        String showId = "613";//archer
//        String showId = "65";//the simpsons
//        String showId = "6959";//game of thrones
//        String showId = "28164";//mr. robot
//        String showId = "15631";//orange is the new black
//        String showId = "8523";//breaking bad
//        String showId = "621";//american horror story
//        String showId = "13424";//sherlock
//        String showId = "1737";//the friends
//        String showId = "16279";//rick and morty
//        String showId = "13689";//star trek the next generation
//        String showId = "405";//south park
        GuideBoxAPIAccessor accessor = new GuideBoxAPIAccessor();
        ObjectMapper mapper = new ObjectMapper();
        List<String> sources = new ArrayList<String>();
        sources.add("all");
        Show show = mapper.readValue(accessor.getShowByShowId(API_KEY, showId), Show.class);
        SeasonsWrapper seasonsWrapper = mapper.readValue(accessor.getSeasonsByShowId(API_KEY, showId), SeasonsWrapper.class);
        for(Season season : seasonsWrapper.getResults()) {
            EpisodesWrapper episodesWrapper = mapper.readValue(accessor.getEpisodesByShowAndSeasonId(
                    API_KEY,
                    showId,
                    season.getSeasonNumber(),
                    0,
                    100,
                    sources,
                    "web",
                    true),
                    EpisodesWrapper.class);
            System.out.println(episodesWrapper.getResults());
            season.setEpisodes(episodesWrapper.getResults());
            show.addSeason(season);
        }
        showRepo.save(show);
    }

}
