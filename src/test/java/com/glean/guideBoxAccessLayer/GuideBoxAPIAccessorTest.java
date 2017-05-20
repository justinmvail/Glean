package com.glean.guideBoxAccessLayer;

/**
 * Created by justi on 12/17/2016.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GuideBoxAPIAccessorTest {

    @Value("${apikey}")
    String apiKey;

    @Autowired
    private GuideBoxAPIAccessor accessor;

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

}