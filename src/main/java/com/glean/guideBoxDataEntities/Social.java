package com.glean.guideBoxDataEntities;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by justi on 12/19/2016.
 */
public class Social {

    @Field(value = "facebook")
    @JsonProperty("facebook")
    private Facebook facebook;

    @Field(value = "twitter")
    @JsonProperty("twitter")
    private Twitter twitter;

}
