package com.glean.controller;

import com.glean.guideBoxDataEntities.Movie;
import com.glean.guideBoxAccessLayer.GuideBoxAPIAccessor;
import com.glean.guideBoxAccessLayer.GuideBoxDataAggregator;
import com.glean.repository.MovieRepo;
import com.glean.wrappers.MovieListWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "movie/{id}", method = RequestMethod.GET)
    public Movie getShow(@PathVariable(value="id") String id) {
        return movieRepo.findById(id);
    }

    @RequestMapping(value = "movie", method = RequestMethod.GET)
    public List<Movie> getMovieByTitle(@RequestParam(value="title") String title) {
        List<Movie> movies = movieRepo.findByTitle(title);
        return movies;
    }

    @RequestMapping(value = "guidebox/movie", method = RequestMethod.GET)
    public MovieListWrapper getMovieFromGuideBoxByTitle(@RequestParam(value="title") String title){
        MovieListWrapper movieListWrapper = null;
        try {
            movieListWrapper = dataAggregator.fetchAndAssembleMovieListFromGuideBoxByTitle(title);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movieListWrapper;
    }

    @RequestMapping(value = "guidebox/movie", method = RequestMethod.POST)
    public void addMovieToGleanFromGuideBox(@RequestParam(value="id") String id){
        try {
            movieRepo.save(dataAggregator.fetchAndAssembleMovieFromGuideBox(id));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
