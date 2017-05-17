package com.glean.guideBoxDataEntity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by justi on 12/17/16.
 */
public class Show{
    @Field(value = "_id")
    @JsonProperty("id")
    private String id;

    private String title;

    @Field(value = "alternate_titles")
    @JsonProperty("alternate_titles")
    private List<String> alternateTitles;

    private String status;

    private String type;

    @Field(value = "container_show")
    @JsonProperty("container_show")
    private String containerShow;

    @Field(value = "first_aired")
    @JsonProperty("first_aired")
    private String firstAired;

    private String network;

    private List<Channel> channels;

    private String runtime;

    private List<Genre> genres;

    private List<Tag> tags;

    private List<Actor> cast;

    private String overview;

    @Field(value = "air_day_of_week")
    @JsonProperty("air_day_of_week")
    private String airDayOfWeek;

    @Field(value = "air_time")
    @JsonProperty("air_time")
    private String airTime;

    private String rating;

    @Field(value = "imdb_id")
    @JsonProperty("imdb_id")
    private String imdbId;

    private String tvdb;

    private String themoviedb;

    private String freebase;

    @Field(value = "tv_com")
    @JsonProperty("tv_com")
    private String tvCom;

    private String metacritic;

    @Field(value = "common_sense_media")
    @JsonProperty("common_sense_media")
    private String commonSenseMedia;

    @Field(value = "wikipedia_id")
    @JsonProperty("wikipedia_id")
    private String wikipediaId;

    private TVRage tvrage;

    private Social social;

    private String fanart;

    private String poster;

    private String banner;

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

    private List<Season> seasons;




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

    public List<String> getAlternateTitles() {
        return alternateTitles;
    }

    public void setAlternateTitles(List<String> alternateTitles) {
        this.alternateTitles = alternateTitles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContainerShow() {
        return containerShow;
    }

    public void setContainerShow(String containerShow) {
        this.containerShow = containerShow;
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

    public List<Channel> getChannels() {
        return channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
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

    public String getAirDayOfWeek() {
        return airDayOfWeek;
    }

    public void setAirDayOfWeek(String airDayOfWeek) {
        this.airDayOfWeek = airDayOfWeek;
    }

    public String getAirTime() {
        return airTime;
    }

    public void setAirTime(String airTime) {
        this.airTime = airTime;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getTvdb() {
        return tvdb;
    }

    public void setTvdb(String tvdb) {
        this.tvdb = tvdb;
    }

    public String getThemoviedb() {
        return themoviedb;
    }

    public void setThemoviedb(String themoviedb) {
        this.themoviedb = themoviedb;
    }

    public String getFreebase() {
        return freebase;
    }

    public void setFreebase(String freebase) {
        this.freebase = freebase;
    }

    public String getTvCom() {
        return tvCom;
    }

    public void setTvCom(String tvCom) {
        this.tvCom = tvCom;
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

    public String getWikipediaId() {
        return wikipediaId;
    }

    public void setWikipediaId(String wikipediaId) {
        this.wikipediaId = wikipediaId;
    }

    public TVRage getTvrage() {
        return tvrage;
    }

    public void setTvrage(TVRage tvrage) {
        this.tvrage = tvrage;
    }

    public Social getSocial() {
        return social;
    }

    public void setSocial(Social social) {
        this.social = social;
    }

    public String getFanart() {
        return fanart;
    }

    public void setFanart(String fanart) {
        this.fanart = fanart;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
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

    public List<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<Season> seasons) {
        this.seasons = seasons;
    }

    public void addSeason(Season season){
        if (seasons == null){
            seasons = new ArrayList<>();
        }
        seasons.add(season);
    }
}