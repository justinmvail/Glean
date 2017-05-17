package com.glean.wrappers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.glean.guideBoxDataEntity.Show;

import java.util.List;

/**
 * Created by justi on 5/14/2017.
 */
public class ShowListWrapper {

    @JsonProperty("total_results")
    private String totalResults;

    @JsonProperty("results")
    private List<Show> results;

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public List<Show> getResults() {
        return results;
    }

    public void setResults(List<Show> results) {
        this.results = results;
    }

}
