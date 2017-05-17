package com.glean.filter;

import com.glean.guideBoxDataEntity.Show;
import com.glean.guideBoxDataEntity.UserStreamSource;

import java.util.List;

/**
 * Created by justi on 5/16/2017.
 */
public interface ShowFilter {
    Show filterShowSeasonsAndEpisodesBasedOnUserStreamSources(Show show, List<UserStreamSource> userStreamSources);

    boolean doesUserHaveAccessToShow(List<UserStreamSource> userStreamSources, Show show);
}
