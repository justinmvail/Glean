package com.glean.entity;

import com.glean.repository.UserProfileRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by justi on 12/30/2016.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserProfileEntityTest {


    @Autowired
    private UserProfileRepo userProfileRepo;


    @Test
    public void getMovieFromDBTest() throws Exception {
        long startingTime = System.currentTimeMillis() % 1000;
        UserProfile userProfile = userProfileRepo.findByUserName("Milo");
        System.out.println("||||||||||"+userProfile.getUserName()+"||||||||||");
        long endingTime = System.currentTimeMillis() % 1000;
        System.out.println("|||||||||| Total Time in Milliseconds: " + (endingTime-startingTime)+"|||||||||||");
    }

}
