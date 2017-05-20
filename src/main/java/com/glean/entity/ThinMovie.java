package com.glean.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.glean.guideBoxDataEntity.Genre;
import com.glean.guideBoxDataEntity.Tag;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * Created by justi on 12/30/2016.
 */
public class ThinMovie {

    @Field(value = "_id")
    @JsonProperty("id")
    private String id;

    private String title;

    @Field(value = "release_year")
    @JsonProperty("release_year")
    private String releaseYear;

    @Field(value = "release_date")
    @JsonProperty("release_date")
    private String releaseDate;

    private String rating;

    private String overview;

    @Field(value = "poster_120x171")
    @JsonProperty("poster_120x171")
    private String poster120x171;

    @Field(value = "poster_240x342")
    @JsonProperty("poster_240x342")
    private String poster240x342;

    @Field(value = "poster_400x570")
    @JsonProperty("poster_400x570")
    private String poster400x570;

    private List<Genre> genres;

    private List<Tag> tags;

    private String duration;

    private String timeStamp;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPoster120x171() {
        return poster120x171;
    }

    public void setPoster120x171(String poster120x171) {
        this.poster120x171 = poster120x171;
    }

    public String getPoster240x342() {
        return poster240x342;
    }

    public void setPoster240x342(String poster240x342) {
        this.poster240x342 = poster240x342;
    }

    public String getPoster400x570() {
        return poster400x570;
    }

    public void setPoster400x570(String poster400x570) {
        this.poster400x570 = poster400x570;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
