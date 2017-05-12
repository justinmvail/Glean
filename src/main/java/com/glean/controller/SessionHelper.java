package com.glean.controller;

import com.glean.entities.UserProfile;

import javax.servlet.http.HttpSession;

/**
 * Created by justi on 5/1/2017.
 */
public class SessionHelper {
    //Thread safe singleton
    private static SessionHelper sessionHelper;

    private static final String userProfile = "userProfile";

    private SessionHelper() {
    }

    public static synchronized SessionHelper getInstance() {
        if (sessionHelper == null) {
            sessionHelper = new SessionHelper();
        }
        return sessionHelper;
    }

    public void setUserProfile(HttpSession session, UserProfile userProfileObject){
        session.setAttribute(userProfile, userProfileObject);
    }

    public UserProfile getUserProfile(HttpSession session){
        return (UserProfile)session.getAttribute(userProfile);
    }


}