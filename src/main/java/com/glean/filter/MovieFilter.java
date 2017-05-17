package com.glean.filter;

import com.glean.guideBoxDataEntity.Movie;
import com.glean.guideBoxDataEntity.UserStreamSource;

import java.util.List;

/**
 * Created by justi on 5/16/2017.
 */
public interface MovieFilter {
    boolean doesUserHaveAccessToMovie(List<UserStreamSource> userStreamSources, Movie movie);
}
