package com.glean.guideBoxDataEntities;

import java.util.List;

/**
 * Created by justi on 12/30/2016.
 */
public class TrailerWrapper {

    private List<Trailer> web;

    private List<Trailer> ios;

    private List<Trailer> android;


    public List<Trailer> getWeb() {
        return web;
    }

    public void setWeb(List<Trailer> web) {
        this.web = web;
    }

    public List<Trailer> getIos() {
        return ios;
    }

    public void setIos(List<Trailer> ios) {
        this.ios = ios;
    }

    public List<Trailer> getAndroid() {
        return android;
    }

    public void setAndroid(List<Trailer> android) {
        this.android = android;
    }
}
