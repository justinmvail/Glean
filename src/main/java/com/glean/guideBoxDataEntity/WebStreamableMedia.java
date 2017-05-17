package com.glean.guideBoxDataEntity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by justi on 5/14/2017.
 */
public abstract class WebStreamableMedia {

    @Field(value = "free_web_sources")
    @JsonProperty("free_web_sources")
    protected List<Source> freeWebSources;

    @Field(value = "tv_everywhere_web_sources")
    @JsonProperty("tv_everywhere_web_sources")
    protected List<Source> tvEverywhereWebSources;

    @Field(value = "subscription_web_sources")
    @JsonProperty("subscription_web_sources")
    protected List<Source> subscriptionWebSources;

    @Field(value = "purchase_web_sources")
    @JsonProperty("purchase_web_sources")
    protected List<Source> purchaseWebSources;

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

    @JsonIgnore
    public List<Source> getAllSources(){
        List<Source> sources = new ArrayList<>();
        sources.addAll(getFreeWebSources());
        sources.addAll(getPurchaseWebSources());
        sources.addAll(getSubscriptionWebSources());
        sources.addAll(getTvEverywhereWebSources());
        return sources;
    }

}
