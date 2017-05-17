package com.glean.controller;

import com.glean.guideBoxDataEntity.UserStreamSource;
import com.glean.repository.UserStreamSourceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by justi on 5/2/2017.
 */
@RestController
public class UserStreamSourceController {


    @Autowired
    private UserStreamSourceRepo userStreamSourceRepo;

    @RequestMapping(value = "userStreamSources/all", method = RequestMethod.GET)
    public List<UserStreamSource> getFreeStreamSources() {
        return userStreamSourceRepo.findAll();
    }

}
