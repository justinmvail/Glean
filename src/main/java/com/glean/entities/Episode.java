package com.glean.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by justi on 12/21/2016.
 */
public class Episode {

    @Field(value = "id")
    @JsonProperty("id")
    private String id;

    private String tvdb;

    @Field(value = "content_type")
    @JsonProperty("content_type")
    private String contentType;

    @Field(value = "is_shadow")
    @JsonProperty("is_shadow")
    private String isShadow;

    @Field(value = "alternate_tvdb")
    @JsonProperty("alternate_tvdb")
    private List<AlternateTVDB> alternateTvdb;

    @Field(value = "imdb_id")
    @JsonProperty("imdb_id")
    private String imdbId;

    private String themoviedb;

    @Field(value = "show_id")
    @JsonProperty("show_id")
    private String showId;

    @Field(value = "season_number")
    @JsonProperty("season_number")
    private String seasonNumber;

    @Field(value = "episode_number")
    @JsonProperty("episode_number")
    private String episodeNumber;

    private String special;

    @Field(value = "first_aired")
    @JsonProperty("first_aired")
    private String firstAired;

    private String title;

    @Field(value = "original_title")
    @JsonProperty("original_title")
    private String originalTitle;

    @Field(value = "alternate_titles")
    @JsonProperty("alternate_titles")
    private List<String> alternateTitles;

    private String overview;

    private String duration;

    @Field(value = "production_code")
    @JsonProperty("production_code")
    private String productionCode;

    @Field(value = "thumbnail_208x117")
    @JsonProperty("thumbnail_208x117")
    private String thumbnail208x117;

    @Field(value = "thumbnail_304x171")
    @JsonProperty("thumbnail_304x171")
    private String thumbnail304x171;

    @Field(value = "thumbnail_400x225")
    @JsonProperty("thumbnail_400x225")
    private String thumbnail400x225;

    @Field(value = "thumbnail_608x342")
    @JsonProperty("thumbnail_608x342")
    private String thumbnail608x342;

    @Field(value = "free_web_sources")
    @JsonProperty("free_web_sources")
    private List<Source> freeWebSources;

    @Field(value = "tv_everywhere_web_sources")
    @JsonProperty("tv_everywhere_web_sources")
    private List<Source> tvEverywhereWebSources;

    @Field(value = "subscription_web_sources")
    @JsonProperty("subscription_web_sources")
    private List<Source> subscriptionWebSources;

    @Field(value = "purchase_web_sources")
    @JsonProperty("purchase_web_sources")
    private List<Source> purchaseWebSources;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTvdb() {
        return tvdb;
    }

    public void setTvdb(String tvdb) {
        this.tvdb = tvdb;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getIsShadow() {
        return isShadow;
    }

    public void setIsShadow(String isShadow) {
        this.isShadow = isShadow;
    }

    public List<AlternateTVDB> getAlternateTvdb() {
        return alternateTvdb;
    }

    public void setAlternateTvdb(List<AlternateTVDB> alternateTvdb) {
        this.alternateTvdb = alternateTvdb;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getThemoviedb() {
        return themoviedb;
    }

    public void setThemoviedb(String themoviedb) {
        this.themoviedb = themoviedb;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public String getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(String seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public String getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(String episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public String getFirstAired() {
        return firstAired;
    }

    public void setFirstAired(String firstAired) {
        this.firstAired = firstAired;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getProductionCode() {
        return productionCode;
    }

    public void setProductionCode(String productionCode) {
        this.productionCode = productionCode;
    }

    public String getThumbnail208x117() {
        return thumbnail208x117;
    }

    public void setThumbnail208x117(String thumbnail208x117) {
        this.thumbnail208x117 = thumbnail208x117;
    }

    public String getThumbnail304x171() {
        return thumbnail304x171;
    }

    public void setThumbnail304x171(String thumbnail304x171) {
        this.thumbnail304x171 = thumbnail304x171;
    }

    public String getThumbnail400x225() {
        return thumbnail400x225;
    }

    public void setThumbnail400x225(String thumbnail400x225) {
        this.thumbnail400x225 = thumbnail400x225;
    }

    public String getThumbnail608x342() {
        return thumbnail608x342;
    }

    public void setThumbnail608x342(String thumbnail608x342) {
        this.thumbnail608x342 = thumbnail608x342;
    }

    public List<Source> getFreeWebSources() {
        return freeWebSources;
    }

    public void setFreeWebSources(List<Source> freeWebSources) {
        this.freeWebSources = freeWebSources;
    }

    public List<Source> getTvEverywhereWebSources() {
        return tvEverywhereWebSources;
    }

    public void setTvEverywhereWebSources(List<Source> tvEverywhereWebSources) {
        this.tvEverywhereWebSources = tvEverywhereWebSources;
    }

    public List<Source> getSubscriptionWebSources() {
        return subscriptionWebSources;
    }

    public void setSubscriptionWebSources(List<Source> subscriptionWebSources) {
        this.subscriptionWebSources = subscriptionWebSources;
    }

    public List<Source> getPurchaseWebSources() {
        return purchaseWebSources;
    }

    public void setPurchaseWebSources(List<Source> purchaseWebSources) {
        this.purchaseWebSources = purchaseWebSources;
    }

    public List<Source> getAllSources(){
        List<Source> sources = new ArrayList<>();
        sources.addAll(getFreeWebSources());
        sources.addAll(getPurchaseWebSources());
        sources.addAll(getSubscriptionWebSources());
        sources.addAll(getTvEverywhereWebSources());
        return sources;
    }
}
