package com.glean.controller;

import com.glean.entities.UserProfile;
import com.glean.repository.UserProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpSession;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by justi on 5/1/2017.
 */

@RestController
public class SessionController {

    @Autowired
    UserProfileRepo userProfileRepo;

    @RequestMapping(value = "session", method = GET)
    public UserProfile getSession(@RequestParam(value="userName") String userName, HttpSession session) {
        UserProfile userProfile = userProfileRepo.findByUserName(userName);
        session.setAttribute("userProfile", userProfile);
        return userProfile;
    }

}
