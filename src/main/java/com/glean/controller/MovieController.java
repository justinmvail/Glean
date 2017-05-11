package com.glean.controller;

import com.glean.entities.Movie;
import com.glean.guideBoxAccessLayer.GuideBoxAPIAccessor;
import com.glean.guideBoxAccessLayer.GuideBoxDataAggregator;
import com.glean.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * Created by justi on 5/1/2017.
 */

@RestController
public class MovieController {

    @Autowired
    private MovieRepo movieRepo;

    @Autowired
    private GuideBoxAPIAccessor guideBoxAPIAccessor;

    @Autowired
    private GuideBoxDataAggregator dataAggregator;

    @Value("${apikey}")
    String apiKey;

    @RequestMapping("movie/{id}")
    public Movie getShow(@PathVariable(value="id") String id) {
        return movieRepo.findById(id);
    }

    @RequestMapping("movie")
    public List<Movie> getMovieByTitle(@RequestParam(value="title") String title) {
        List<Movie> movies = movieRepo.findByTitle(title);
        return movies;
    }

}
