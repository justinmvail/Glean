package com.glean.guideBoxMining;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.glean.entities.EpisodesWrapper;
import com.glean.entities.Season;
import com.glean.entities.SeasonsWrapper;
import com.glean.entities.Show;
import com.glean.guideBoxAccessLayer.GuideBoxAPIAccessor;
import com.glean.utility.GuideBoxDataAggregator;
import com.glean.repository.ShowRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
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

    @Value("${apikey}")
    String apiKey;

    @Autowired
    private ShowRepo showRepo;

    @Autowired
    private GuideBoxAPIAccessor accessor;

    @Autowired
    GuideBoxDataAggregator dataAggregator;


    @Test
    public void guideBoxDataFormatterTest() throws IOException {
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
//        String showId = "2098";//arrested development
        showRepo.save(dataAggregator.assembleFullShowFromGuideBox(showId));
    }

}
