package com.glean.controller;

import com.glean.entities.Movie;
import com.glean.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by justi on 5/1/2017.
 */

@RestController
public class MovieController {

    @Autowired
    private MovieRepo movieRepo;

    @RequestMapping("movie/{id}")
    public Movie getShow(@PathVariable(value="id") String id) {
        return movieRepo.findById(id);
    }

}
