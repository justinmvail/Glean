package com.glean.guideBoxDataEntity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by justi on 12/19/2016.
 */
public class TVRage {

    @Field(value = "tvrage_id")
    @JsonProperty("tvrage_id")
    private String tvrageId;

    private String link;

    public String getTvrageId() {
        return tvrageId;
    }

    public void setTvrageId(String tvrageId) {
        this.tvrageId = tvrageId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
