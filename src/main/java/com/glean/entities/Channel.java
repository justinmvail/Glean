package com.glean.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by justi on 12/19/2016.
 */
public class Channel {

    @Field(value = "id")
    private String id;

    private String name;

    private String short_name;

    private String channel_type;

    private String artwork_208x117;

    private String artwork_304x171;

    private String artwork_448x252;

    private String artwork_608x342;

    private ExternalID external_ids;

    private Social social;

    private LiveStream live_stream;

    private String is_primary;


}
