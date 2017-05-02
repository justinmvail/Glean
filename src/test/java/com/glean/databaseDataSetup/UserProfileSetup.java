package com.glean.databaseDataSetup;

import com.glean.entities.*;
import com.glean.repository.MovieRepo;
import com.glean.repository.ShowRepo;
import com.glean.repository.UserProfileRepo;
import com.glean.guideBoxAccessLayer.GuideBoxDataAggregator;
import com.mongodb.MongoClient;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by justi on 1/8/2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserProfileSetup {

    @Value("${spring.data.mongodb.database}")
    String databaseName;

    @Value("${apikey}")
    String apiKey;

    @Autowired
    private GuideBoxDataAggregator guideBoxDataAggregator;

    @Autowired
    private ShowRepo showRepo;

    @Autowired
    private MovieRepo movieRepo;

    @Autowired
    private UserProfileRepo userProfileRepo;

    @Value("${showid.module.elementToSearch}")
    private String[] showIds;

    @Value("${movieid.module.elementToSearch}")
    private String[] movieIds;

    @Value("${userName.module.elementToSearch}")
    private String[] userNames;

    @Value("${database.collection.userProfile}")
    String userProfileCollection;

    @Ignore
    @Test
    public void createTestDataUserProfilesByScrapingGuideBox() throws IOException {

        MongoTemplate mongoTemplate = new MongoTemplate(new SimpleMongoDbFactory(new MongoClient(), databaseName));
        mongoTemplate.remove(new Query(), userProfileCollection);

        List<UserStreamSource> freeStreamingSources = guideBoxDataAggregator.fetchAndAssembleFreeSources();

        for(String userName : userNames) {
            UserProfile userProfile = new UserProfile();
            userProfile.setUserName(userName);
            userProfile.setUserStreamSources(freeStreamingSources);

            List<ThinShow> thinShows = new ArrayList<>();
            for (String showId : showIds) {
                Show show = showRepo.findById(showId);
                ThinShow thinShow = new ThinShow();
                BeanUtils.copyProperties(show, thinShow);
                thinShows.add(thinShow);
            }
            userProfile.setAvailableShows(thinShows);

            List<ThinMovie> thinMovies = new ArrayList<>();
            for (String movieId : movieIds) {
                Movie movie = movieRepo.findById(movieId);
                ThinMovie thinMovie = new ThinMovie();
                BeanUtils.copyProperties(movie, thinMovie);
                thinMovies.add(thinMovie);
            }
            userProfile.setAvailableMovies(thinMovies);

            userProfileRepo.save(userProfile);
        }
    }
}
