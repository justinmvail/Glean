package com.glean.filter;

import com.glean.guideBoxDataEntity.Show;
import com.glean.guideBoxDataEntity.UserStreamSource;
import com.glean.repository.ShowRepo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by justi on 4/19/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShowFilterTest {

    @Autowired
    private ShowRepo showRepo;

    @Test
    public void testFilterShowEpisodesAndSourcesBasedOnUserStreamSources() throws Exception {
        long startingTime = System.currentTimeMillis() % 1000;
        Show show = showRepo.findById("613");
        List<UserStreamSource> streamSources = new ArrayList<>();
        UserStreamSource userStreamSource = new UserStreamSource();
        userStreamSource.setSource("netflix");
        streamSources.add(userStreamSource);
        Show filteredShow = ShowFilter.getInstance().filterShowSeasonsAndEpisodesBasedOnUserStreamSources(show, streamSources);
        Assert.assertNotNull(filteredShow.getSeasons().get(0).getEpisodes().get(0));

        long endingTime = System.currentTimeMillis() % 1000;
        System.out.println("|||||||||| Total Time in Milliseconds: " + (endingTime-startingTime)+"|||||||||||");
    }

}