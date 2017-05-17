package com.glean.guideBoxDataEntity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by justi on 12/19/2016.
 */
public class StreamSource {

    private String source;

    @Field(value = "display_name")
    @JsonProperty("display_name")
    private String displayName;

    @Field(value = "tv_channel")
    @JsonProperty("tv_channel")
    private String tvChannel;

    private String type;

    private String link;

    @Field(value = "link_type")
    @JsonProperty("link_type")
    private String linkType;

    @Field(value = "app_name")
    @JsonProperty("app_name")
    private String appName;

    @Field(value = "app_link")
    @JsonProperty("app_link")
    private String appLink;

    @Field(value = "app_required")
    @JsonProperty("app_required")
    private String appRequired;

    @Field(value = "app_download_link")
    @JsonProperty("app_download_link")
    private String appDownloadLink;


    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getTvChannel() {
        return tvChannel;
    }

    public void setTvChannel(String tvChannel) {
        this.tvChannel = tvChannel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppLink() {
        return appLink;
    }

    public void setAppLink(String appLink) {
        this.appLink = appLink;
    }

    public String getAppRequired() {
        return appRequired;
    }

    public void setAppRequired(String appRequired) {
        this.appRequired = appRequired;
    }

    public String getAppDownloadLink() {
        return appDownloadLink;
    }

    public void setAppDownloadLink(String appDownloadLink) {
        this.appDownloadLink = appDownloadLink;
    }
}
