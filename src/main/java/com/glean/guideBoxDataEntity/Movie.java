package com.glean.guideBoxDataEntity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * Created by justi on 12/30/2016.
 */
public class Movie extends WebStreamableMedia {

    @Field(value = "_id")
    @JsonProperty("id")
    private String id;

    private String title;

    @Field(value = "release_year")
    @JsonProperty("release_year")
    private String releaseYear;

    private String themoviedb;

    @Field(value = "original_title")
    @JsonProperty("original_title")
    private String originalTitle;

    @Field(value = "alternate_titles")
    @JsonProperty("alternate_titles")
    private List<String> alternateTitles;

    @Field(value = "imdb_id")
    @JsonProperty("imdb_id")
    private String imdbId;

    @Field(value = "pre_order")
    @JsonProperty("pre_order")
    private boolean preOrder;

    @Field(value = "in_theaters")
    @JsonProperty("in_theaters")
    private boolean inTheaters;

    @Field(value = "release_date")
    @JsonProperty("release_date")
    private String releaseDate;

    private String rating;

    @Field(value = "rottentomatoes")
    @JsonProperty("rottentomatoes")
    private String rottenTomatoes;

    private String freebase;

    @Field(value = "wikipedia_id")
    @JsonProperty("wikipedia_id")
    private String wikipediaId;

    private String metacritic;

    @Field(value = "common_sense_media")
    @JsonProperty("common_sense_media")
    private String commonSenseMedia;

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

    private Social social;

    private List<Genre> genres;

    private List<Tag> tags;

    private String duration;

    private TrailerWrapper trailers;

    private List<Writer> writers;

    private List<Director> directors;

    private List<Actor> cast;

    @Field(value = "free_ios_sources")
    @JsonProperty("free_ios_sources")
    private List<Source> freeIosSources;

    @Field(value = "free_android_sources")
    @JsonProperty("free_android_sources")
    private List<Source> freeAndroidSources;

    @Field(value = "tv_everywhere_ios_sources")
    @JsonProperty("tv_everywhere_ios_sources")
    private List<Source> tvEverywhereIosSources;

    @Field(value = "tv_everywhere_android_sources")
    @JsonProperty("tv_everywhere_android_sources")
    private List<Source> tvEverywhereAndroidSources;

    @Field(value = "subscription_ios_sources")
    @JsonProperty("subscription_ios_sources")
    private List<Source> subscriptionIosSources;

    @Field(value = "subscription_android_sources")
    @JsonProperty("subscription_android_sources")
    private List<Source> subscriptionAndroidSources;

    @Field(value = "purchase_ios_sources")
    @JsonProperty("purchase_ios_sources")
    private List<Source> purchaseIosSources;

    @Field(value = "purchase_android_sources")
    @JsonProperty("purchase_android_sources")
    private List<Source> purchaseAndroidSources;

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

    public String getThemoviedb() {
        return themoviedb;
    }

    public void setThemoviedb(String themoviedb) {
        this.themoviedb = themoviedb;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public List<String> getAlternateTitles() {
        return alternateTitles;
    }

    public void setAlternateTitles(List<String> alternateTitles) {
        this.alternateTitles = alternateTitles;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public boolean isPreOrder() {
        return preOrder;
    }

    public void setPreOrder(boolean preOrder) {
        this.preOrder = preOrder;
    }

    public boolean isInTheaters() {
        return inTheaters;
    }

    public void setInTheaters(boolean inTheaters) {
        this.inTheaters = inTheaters;
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

    public String getRottenTomatoes() {
        return rottenTomatoes;
    }

    public void setRottenTomatoes(String rottenTomatoes) {
        this.rottenTomatoes = rottenTomatoes;
    }

    public String getFreebase() {
        return freebase;
    }

    public void setFreebase(String freebase) {
        this.freebase = freebase;
    }

    public String getWikipediaId() {
        return wikipediaId;
    }

    public void setWikipediaId(String wikipediaId) {
        this.wikipediaId = wikipediaId;
    }

    public String getMetacritic() {
        return metacritic;
    }

    public void setMetacritic(String metacritic) {
        this.metacritic = metacritic;
    }

    public String getCommonSenseMedia() {
        return commonSenseMedia;
    }

    public void setCommonSenseMedia(String commonSenseMedia) {
        this.commonSenseMedia = commonSenseMedia;
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

    public Social getSocial() {
        return social;
    }

    public void setSocial(Social social) {
        this.social = social;
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

    public TrailerWrapper getTrailers() {
        return trailers;
    }

    public void setTrailers(TrailerWrapper trailers) {
        this.trailers = trailers;
    }

    public List<Writer> getWriters() {
        return writers;
    }

    public void setWriters(List<Writer> writers) {
        this.writers = writers;
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }

    public List<Actor> getCast() {
        return cast;
    }

    public void setCast(List<Actor> cast) {
        this.cast = cast;
    }

    public List<Source> getFreeIosSources() {
        return freeIosSources;
    }

    public void setFreeIosSources(List<Source> freeIosSources) {
        this.freeIosSources = freeIosSources;
    }

    public List<Source> getFreeAndroidSources() {
        return freeAndroidSources;
    }

    public void setFreeAndroidSources(List<Source> freeAndroidSources) {
        this.freeAndroidSources = freeAndroidSources;
    }

    public List<Source> getTvEverywhereIosSources() {
        return tvEverywhereIosSources;
    }

    public void setTvEverywhereIosSources(List<Source> tvEverywhereIosSources) {
        this.tvEverywhereIosSources = tvEverywhereIosSources;
    }

    public List<Source> getTvEverywhereAndroidSources() {
        return tvEverywhereAndroidSources;
    }

    public void setTvEverywhereAndroidSources(List<Source> tvEverywhereAndroidSources) {
        this.tvEverywhereAndroidSources = tvEverywhereAndroidSources;
    }

    public List<Source> getSubscriptionIosSources() {
        return subscriptionIosSources;
    }

    public void setSubscriptionIosSources(List<Source> subscriptionIosSources) {
        this.subscriptionIosSources = subscriptionIosSources;
    }

    public List<Source> getSubscriptionAndroidSources() {
        return subscriptionAndroidSources;
    }

    public void setSubscriptionAndroidSources(List<Source> subscriptionAndroidSources) {
        this.subscriptionAndroidSources = subscriptionAndroidSources;
    }

    public List<Source> getPurchaseIosSources() {
        return purchaseIosSources;
    }

    public void setPurchaseIosSources(List<Source> purchaseIosSources) {
        this.purchaseIosSources = purchaseIosSources;
    }

    public List<Source> getPurchaseAndroidSources() {
        return purchaseAndroidSources;
    }

    public void setPurchaseAndroidSources(List<Source> purchaseAndroidSources) {
        this.purchaseAndroidSources = purchaseAndroidSources;
    }

}
