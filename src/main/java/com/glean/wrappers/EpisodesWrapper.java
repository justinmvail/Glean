package com.glean.wrappers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.glean.guideBoxDataEntities.Episode;

import java.util.List;

/**
 * Created by justi on 12/21/2016.
 */
public class EpisodesWrapper {

       @JsonProperty("total_results")
       private String totalResults;

       @JsonProperty("total_returned")
       private String totalReturned;

       @JsonProperty("results")
       private List<Episode> results;



       public String getTotalResults() {
              return totalResults;
       }

       public void setTotalResults(String totalResults) {
              this.totalResults = totalResults;
       }

       public String getTotalReturned() {
              return totalReturned;
       }

       public void setTotalReturned(String totalReturned) {
              this.totalReturned = totalReturned;
       }

       public List<Episode> getResults() {
              return results;
       }

       public void setResults(List<Episode> results) {
              this.results = results;
       }
}
