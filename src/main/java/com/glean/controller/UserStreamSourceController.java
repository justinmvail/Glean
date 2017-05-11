package com.glean.controller;

import com.glean.guideBoxDataEntities.UserStreamSource;
import com.glean.repository.UserStreamSourceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by justi on 5/2/2017.
 */
@RestController
public class UserStreamSourceController {


    @Autowired
    private UserStreamSourceRepo userStreamSourceRepo;

    @RequestMapping("userStreamSources/all")
    public List<UserStreamSource> getFreeStreamSources() {
        return userStreamSourceRepo.findAll();
    }

}
