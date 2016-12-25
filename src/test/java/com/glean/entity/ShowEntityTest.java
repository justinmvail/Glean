package com.glean.entity;

import com.glean.entities.Episode;
import com.glean.entities.Season;
import com.glean.entities.Show;
import com.glean.guideBoxAccessLayer.GuideBoxAPIAccessor;
import com.glean.services.ShowRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by justi on 12/24/2016.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShowEntityTest {

    @Autowired
    private ShowRepo showRepo;

    @Test
    public void getShowFromDBTest() throws Exception {
        long startingTime = System.currentTimeMillis() % 1000;
        Show show = showRepo.findById("65");
        System.out.println("||||||||||"+show.getTitle()+"||||||||||");
        List<Season> seasons = show.getSeasons();
        for (Season season : seasons){
            System.out.println(season.getSeasonNumber());
            List<Episode> episodes = season.getEpisodes();
            for(Episode episode : episodes){
                System.out.println("===>"+episode.getEpisodeNumber()+": "+episode.getTitle().replace("\n","")+" - "+episode.getOverview().replace("\n",""));
            }
        }
        long endingTime = System.currentTimeMillis() % 1000;
        System.out.println("|||||||||| Total Time in Milliseconds: " + (endingTime-startingTime)+"|||||||||||");
    }




}
