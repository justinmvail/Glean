package com.glean.guideBoxAccessLayer;

/**
 * Created by justi on 12/17/2016.
 */

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GuideBoxAPIAccessorImplTest {

    @Value("${apikey}")
    String apiKey;

    @Autowired
    private GuideBoxAPIAccessor accessor;

    String unixTimeStamp;

    @Before
    public void setup(){
        //setting unixTimeStamp to one week prior to runtime.
        unixTimeStamp = String.valueOf((new Date().getTime()/1000)-1653440);//
    }

    @Test
    public void testSearchForShowByShowTitle() throws Exception {
        System.out.println("Searching For Show By Title: ");
        String jsonResult = accessor.getShowByShowTitle(apiKey, "arrested development");
        System.out.println(jsonResult);
    }

    @Test
    public void testGetShowByTelevisionDatabaseShowId() throws Exception {
        System.out.println("Getting Show By Television Database ID: ");
        String jsonResult = accessor.getShowByTelevisionDatabaseShowId(apiKey, "110381");
        System.out.println(jsonResult);
    }

    @Test
    public void testGetShowByShowId() throws Exception {
        System.out.println("Getting Show By ID: ");
        String jsonResult = accessor.getShowByShowId(apiKey, "613");
        System.out.println(jsonResult);
    }

    @Test
    public void testGetSeasonsByShowId() throws Exception {
        System.out.println("Getting Seasons By Show ID: ");
        String jsonResult = accessor.getSeasonsByShowId(apiKey, "613");
        System.out.println(jsonResult);
    }

    @Test
    public void getEpisodesBoyShowAndSeasonId() throws Exception {
        System.out.println("Getting Episodes By Show and Season ID: ");
        List<String> sources = new ArrayList<String>();
        sources.add("all");
        String jsonResult = accessor.getEpisodesByShowAndSeasonId(apiKey, "613", 1, 0, 10, sources, "web", false);
        System.out.println(jsonResult);
    }

    @Test
    public void getSimilarShowById() throws Exception {
        System.out.println("Getting Similar Show By ID: ");
        String jsonResult = accessor.getSimilarShowById(apiKey, "613");
        System.out.println(jsonResult);
    }

    @Test
    public void getFreeSources() throws Exception {
        System.out.println("Getting Free Sources");
        String jsonResult = accessor.getFreeUserStreamSources(apiKey);
        System.out.println(jsonResult);
    }

    @Test
    public void getSubscriptionSources() throws Exception {
        System.out.println("Getting Subscription Sources");
        String jsonResult = accessor.getSubscriptionUserStreamSources(apiKey);
        System.out.println(jsonResult);
    }

    @Test
    public void testSearchForMovieByMovieTitle() throws Exception {
        System.out.println("Searching For Movie By Title: ");
        String jsonResult = accessor.getMovieByTitle(apiKey, "the revenant");
        System.out.println(jsonResult);
    }

    @Test
    public void testGetMovieByTheMovieDBId() throws Exception {
        System.out.println("Getting Movie By TheMovieDB ID: ");
        String jsonResult = accessor.getMovieByTheMovieDBShowId(apiKey, "65412");
        System.out.println(jsonResult);
    }

    @Test
    public void testGetMovieById() throws Exception {
        System.out.println("Getting Movie By ID: ");
        String jsonResult = accessor.getMovieByMovieId(apiKey, "65412");
        System.out.println(jsonResult);
    }

    @Test
    public void testGetTimeStamp() throws Exception {
        System.out.println("Getting TimeStamp From GuideBox: ");
        String jsonResult = accessor.getGuideBoxTimeStamp(apiKey);
        System.out.println(jsonResult);
    }




    @Test
    public void getChangedShows() throws Exception {
        System.out.println("Getting Shows that changed from GuideBox: ");
        String jsonResult = accessor.getChangedShows(apiKey, unixTimeStamp, "10", "1");
        System.out.println(jsonResult);
    }

    @Test
    public void getDeletedShows() throws Exception {
        System.out.println("Getting deleted shows from GuideBox: ");
        String jsonResult = accessor.getDeletedShows(apiKey, unixTimeStamp, "10", "1");
        System.out.println(jsonResult);
    }

    @Test
    public void getShowWithChangedEpisodes() throws Exception {
        System.out.println("Getting show with changed episodes from GuideBox: ");
        String jsonResult = accessor.getShowWithChangedEpisodes(apiKey, unixTimeStamp, "10", "1");
        System.out.println(jsonResult);
    }

    @Test
    public void getChangedEpisodes() throws Exception {
        System.out.println("Getting changed episodes from GuideBox: ");
        String jsonResult = accessor.getChangedEpisodes(apiKey, unixTimeStamp, "10", "1");
        System.out.println(jsonResult);
    }

    @Test
    public void getNewEpisodes() throws Exception {
        System.out.println("Getting new episodes for a show from GuideBox: ");
        String jsonResult = accessor.getNewEpisodes(apiKey, unixTimeStamp, "10", "1");
        System.out.println(jsonResult);
    }

    @Test
    public void getDeletedEpisodes() throws Exception {
        System.out.println("Getting deleted episodes for a show from GuideBox: ");
        String jsonResult = accessor.getDeletedEpisodes(apiKey, unixTimeStamp, "10", "1");
        System.out.println(jsonResult);
    }

    @Test
    public void getChangedMovies() throws Exception {
        System.out.println("Getting changed movies from GuideBox: ");
        String jsonResult = accessor.getChangedMovies(apiKey, unixTimeStamp, "10", "1");
        System.out.println(jsonResult);
    }

    @Test
    public void getDeletedMovies() throws Exception {
        System.out.println("Getting deleted movies from GuideBox: ");
        String jsonResult = accessor.getDeletedMovies(apiKey, unixTimeStamp, "10", "1");
        System.out.println(jsonResult);
    }

}