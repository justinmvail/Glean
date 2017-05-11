package com.glean.guideBoxDataEntities;

import java.util.List;

/**
 * Created by justi on 12/19/2016.
 */
public class LiveStream {

    private List<StreamSource> web;

    private List<StreamSource> ios;

    private List<StreamSource> android;

    public List<StreamSource> getWeb() {
        return web;
    }

    public void setWeb(List<StreamSource> web) {
        this.web = web;
    }

    public List<StreamSource> getIos() {
        return ios;
    }

    public void setIos(List<StreamSource> ios) {
        this.ios = ios;
    }

    public List<StreamSource> getAndroid() {
        return android;
    }

    public void setAndroid(List<StreamSource> android) {
        this.android = android;
    }
}
