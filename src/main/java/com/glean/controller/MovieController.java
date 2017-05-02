package com.glean.controller;

import com.glean.entities.Movie;
import com.glean.entities.Show;
import com.glean.filter.ShowFilter;
import com.glean.repository.MovieRepo;
import com.glean.repository.ShowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

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
