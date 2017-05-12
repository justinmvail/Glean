package com.glean.controller;

import com.glean.entities.ThinMovie;
import com.glean.entities.UserProfile;
import com.glean.guideBoxDataEntities.Movie;
import com.glean.repository.MovieRepo;
import com.glean.repository.UserProfileRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by justi on 5/11/2017.
 */

@RestController
public class UserProfileController {

    @Autowired
    private UserProfileRepo userProfileRepo;

    @Autowired
    private MovieRepo movieRepo;

//    @RequestMapping(value = "userProfile/movie", method = RequestMethod.POST)
//    public void addMovieToUserProfile(@RequestParam(value="id") String id, HttpSession session) {
//        UserProfile userProfile = userProfileRepo.findByUserId(SessionHelper.getInstance().getUserProfile(session).getUserId());
////        Movie movie = movieRepo.findById(id);
////        ThinMovie thinMovie = new ThinMovie();
////        BeanUtils.copyProperties(movie, thinMovie);
//////        TODO: this should not just be added to the "availableMovies".  We need to determine where it goes based on the userStreawmSources
////        userProfile.getAvailableMovies().add(thinMovie);
//        userProfileRepo.(userProfile);
////        SessionHelper.getInstance().setUserProfile(session, userProfile);
//    }

}
