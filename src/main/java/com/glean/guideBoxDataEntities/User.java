package com.glean.guideBoxDataEntities;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by michaelplott on 12/17/16.
 */
public class User {

    @Field(value = "_id")
    private String id;

    private String userName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
