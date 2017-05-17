package com.glean.guideBoxDataEntity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by justi on 1/10/2017.
 */
public class UserStreamSource {

    private String id;

    private String source;

    @Field(value = "display_name")
    @JsonProperty("display_name")
    private String displayName;

    private String type;

    private String info;

    @Field(value = "ios_app")
    @JsonProperty("ios_app")
    private String iosApp;

    @Field(value = "android_app")
    @JsonProperty("android_app")
    private String androidApp;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getIosApp() {
        return iosApp;
    }

    public void setIosApp(String iosApp) {
        this.iosApp = iosApp;
    }

    public String getAndroidApp() {
        return androidApp;
    }

    public void setAndroidApp(String androidApp) {
        this.androidApp = androidApp;
    }
}
