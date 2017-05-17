package com.glean.guideBoxAccessLayer;

import com.glean.guideBoxDataEntity.Movie;
import com.glean.guideBoxDataEntity.Show;
import com.glean.wrappers.MovieListWrapper;
import com.glean.wrappers.ShowListWrapper;
import com.glean.wrappers.UserStreamSourceWrapper;

import java.io.IOException;

/**
 * Created by justi on 5/16/2017.
 */
public interface GuideBoxDataAggregator {
    Show fetchAndAssembleFullShowFromGuideBox(String showId) throws IOException;

    ShowListWrapper fetchAndAssembleShowFromGuideBox(String title) throws IOException;

    Movie fetchAndAssembleMovieFromGuideBox(String movieId) throws IOException;

    MovieListWrapper fetchAndAssembleMovieListFromGuideBoxByTitle(String title) throws IOException;

    UserStreamSourceWrapper fetchAndAssembleFreeSources() throws IOException;

    UserStreamSourceWrapper fetchAndAssembleSubscriptionSources() throws IOException;
}
