package com.glean.wrappers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.glean.guideBoxDataEntity.Season;

import java.util.List;

/**
 * Created by justi on 12/21/2016.
 */
public class SeasonsWrapper {

    @JsonProperty("results")
    private List<Season> results;

    @JsonProperty("total_results")
    private int totalResults;




    public List<Season> getResults() {
        return results;
    }

    public void setResults(List<Season> results) {
        this.results = results;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
}
