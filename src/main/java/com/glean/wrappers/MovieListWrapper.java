package com.glean.wrappers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.glean.guideBoxDataEntity.Movie;

import java.util.List;

/**
 * Created by justi on 5/11/2017.
 */
public class MovieListWrapper {

    @JsonProperty("total_results")
    private String totalResults;

    @JsonProperty("results")
    private List<Movie> results;

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }
}
