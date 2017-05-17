package com.glean.guideBoxDataEntity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * Created by justi on 12/21/2016.
 */
public class Season {

    @Field(value = "season_number")
    @JsonProperty("season_number")
    private int seasonNumber;

    @Field(value = "first_airdate")
    @JsonProperty("first_airdate")
    private String firstAirdate;

    List<Episode> episodes;


    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public String getFirstAirdate() {
        return firstAirdate;
    }

    public void setFirstAirdate(String firstAirdate) {
        this.firstAirdate = firstAirdate;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }
}
