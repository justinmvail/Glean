package com.glean.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.glean.guideBoxDataEntities.Actor;
import com.glean.guideBoxDataEntities.Genre;
import com.glean.guideBoxDataEntities.Tag;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * Created by justi on 12/29/2016.
 */
public class ThinShow {

    @Field(value = "_id")
    @JsonProperty("id")
    private String id;

    private String title;

    @Field(value = "first_aired")
    @JsonProperty("first_aired")
    private String firstAired;

    private String network;

    private List<Genre> genres;

    private List<Tag> tags;

    private List<Actor> cast;

    private String overview;

    private String rating;

    @Field(value = "artwork_208x117")
    @JsonProperty("artwork_208x117")
    private String artwork208x117;

    @Field(value = "artwork_304x171")
    @JsonProperty("artwork_304x171")
    private String artwork304x171;

    @Field(value = "artwork_448x252")
    @JsonProperty("artwork_448x252")
    private String artwork448x252;

    @Field(value = "artwork_608x342")
    @JsonProperty("artwork_608x342")
    private String artwork608x342;

    private String url;


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

    public String getFirstAired() {
        return firstAired;
    }

    public void setFirstAired(String firstAired) {
        this.firstAired = firstAired;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
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

    public List<Actor> getCast() {
        return cast;
    }

    public void setCast(List<Actor> cast) {
        this.cast = cast;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getArtwork208x117() {
        return artwork208x117;
    }

    public void setArtwork208x117(String artwork208x117) {
        this.artwork208x117 = artwork208x117;
    }

    public String getArtwork304x171() {
        return artwork304x171;
    }

    public void setArtwork304x171(String artwork304x171) {
        this.artwork304x171 = artwork304x171;
    }

    public String getArtwork448x252() {
        return artwork448x252;
    }

    public void setArtwork448x252(String artwork448x252) {
        this.artwork448x252 = artwork448x252;
    }

    public String getArtwork608x342() {
        return artwork608x342;
    }

    public void setArtwork608x342(String artwork608x342) {
        this.artwork608x342 = artwork608x342;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

