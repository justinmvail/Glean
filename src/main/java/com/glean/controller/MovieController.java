package com.glean.controller;

import com.glean.guideBoxDataEntities.Movie;
import com.glean.guideBoxAccessLayer.GuideBoxAPIAccessor;
import com.glean.guideBoxAccessLayer.GuideBoxDataAggregator;
import com.glean.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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

//    @RequestMapping(value = "guidebox/movie", method = RequestMethod.GET)
//    public List<Movie> getMovieFromGuideBoxByTitle(@RequestParam(value="title") String title) {
//
//
//    }

}
