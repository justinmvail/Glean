package com.glean.wrappers;

import com.glean.guideBoxDataEntity.UserStreamSource;

import java.util.List;

/**
 * Created by justi on 1/10/2017.
 */
public class UserStreamSourceWrapper {

    private List<UserStreamSource> results;


    public List<UserStreamSource> getResults() {
        return results;
    }

    public void setResults(List<UserStreamSource> results) {
        this.results = results;
    }
}
