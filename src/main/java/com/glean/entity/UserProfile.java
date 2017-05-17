package com.glean.entity;

import com.glean.guideBoxDataEntity.UserStreamSource;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by justi on 12/30/2016.
 */
public class UserProfile {

    @Id
    private ObjectId userId;

    private String userName;

    private List<UserStreamSource> userStreamSources;

    private List<ThinShow> availableShows;

    private List<ThinMovie> availableMovies;

    private List<ThinShow> wantedShows;

    private List<ThinMovie> wantedMovies;


    public ObjectId getUserId() {
        return userId;
    }

    public void setUserId(ObjectId userId) {
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
        if(availableShows == null){
            availableShows = new ArrayList<>();
        }
        return availableShows;
    }

    public void setAvailableShows(List<ThinShow> availableShows) {
        this.availableShows = availableShows;
    }

    public List<ThinMovie> getAvailableMovies() {
        if(availableMovies == null){
            availableMovies = new ArrayList<>();
        }
        return availableMovies;
    }

    public void setAvailableMovies(List<ThinMovie> availableMovies) {
        this.availableMovies = availableMovies;
    }

    public List<ThinShow> getWantedShows() {
        if(wantedShows == null){
            wantedShows = new ArrayList<>();
        }
        return wantedShows;
    }

    public void setWantedShows(List<ThinShow> wantedShows) {
        this.wantedShows = wantedShows;
    }

    public List<ThinMovie> getWantedMovies() {
        if(wantedMovies == null){
            wantedMovies = new ArrayList<>();
        }
        return wantedMovies;
    }

    public void setWantedMovies(List<ThinMovie> wantedMovies) {
        this.wantedMovies = wantedMovies;
    }
}
