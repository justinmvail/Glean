package com.glean.guideBoxDataEntities;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by justi on 12/19/2016.
 */
public class Channel {

    @Field(value = "id")
    @JsonProperty("id")
    private String id;

    private String name;

    @Field(value = "short_name")
    @JsonProperty("short_name")
    private String shortName;

    @Field(value = "channel_type")
    @JsonProperty("channel_type")
    private String channelType;

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

    @Field(value = "external_ids")
    @JsonProperty("external_ids")
    private ExternalID externalIds;

    private Social social;

    @Field(value = "live_stream")
    @JsonProperty("live_stream")
    private LiveStream liveStream;

    @Field(value = "is_primary")
    @JsonProperty("is_primary")
    private String isPrimary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
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

    public ExternalID getExternalIds() {
        return externalIds;
    }

    public void setExternalIds(ExternalID externalIds) {
        this.externalIds = externalIds;
    }

    public Social getSocial() {
        return social;
    }

    public void setSocial(Social social) {
        this.social = social;
    }

    public LiveStream getLiveStream() {
        return liveStream;
    }

    public void setLiveStream(LiveStream liveStream) {
        this.liveStream = liveStream;
    }

    public String getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(String isPrimary) {
        this.isPrimary = isPrimary;
    }
}
