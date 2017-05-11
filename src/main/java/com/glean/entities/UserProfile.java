package com.glean.entities;

import com.glean.guideBoxDataEntities.UserStreamSource;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * Created by justi on 12/30/2016.
 */
public class UserProfile {

    @Field(value = "_id")
    private String userId;

    private String userName;

    private List<UserStreamSource> userStreamSources;

    private List<ThinShow> availableShows;

    private List<ThinMovie> availableMovies;

    private List<ThinShow> wantedShows;

    private List<ThinMovie> wantedMovies;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<UserStreamSource> getUserStreamSources() {
        return userStreamSources;
    }

    public void setUserStreamSources(List<UserStreamSource> userStreamSources) {
        this.userStreamSources = userStreamSources;
    }

    public List<ThinShow> getAvailableShows() {
        return availableShows;
    }

    public void setAvailableShows(List<ThinShow> availableShows) {
        this.availableShows = availableShows;
    }

    public List<ThinMovie> getAvailableMovies() {
        return availableMovies;
    }

    public void setAvailableMovies(List<ThinMovie> availableMovies) {
        this.availableMovies = availableMovies;
    }

    public List<ThinShow> getWantedShows() {
        return wantedShows;
    }

    public void setWantedShows(List<ThinShow> wantedShows) {
        this.wantedShows = wantedShows;
    }

    public List<ThinMovie> getWantedMovies() {
        return wantedMovies;
    }

    public void setWantedMovies(List<ThinMovie> wantedMovies) {
        this.wantedMovies = wantedMovies;
    }
}
