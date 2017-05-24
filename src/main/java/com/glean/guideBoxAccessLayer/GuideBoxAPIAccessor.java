package com.glean.guideBoxAccessLayer;

import java.io.IOException;
import java.util.List;

/**
 * Created by justi on 5/16/2017.
 */
public interface GuideBoxAPIAccessor {
    String getShowByShowTitle(String apiKey, String title) throws IOException;

    String getShowByTelevisionDatabaseShowId(String apiKey, String showId) throws IOException;

    String getShowByShowId(String apiKey, String showId) throws IOException;

    String getSeasonsByShowId(String apiKey, String showId) throws IOException;

    String getEpisodesByShowAndSeasonId(String apiKey, String showId, int seasonNumber, int startingEpisode, int episodeCount, List<String> sources, String platform, boolean includedLinks, boolean chronologicalOrder) throws IOException;

    String getEpisodesByShowAndSeasonId(String apiKey, String showId, int seasonNumber, int startingEpisode, int episodeCount, List<String> sources, String platform, boolean includedLinks) throws IOException;

    String getSimilarShowById(String apiKey, String showId) throws IOException;

    String getFreeUserStreamSources(String apiKey) throws IOException;

    String getSubscriptionUserStreamSources(String apiKey) throws IOException;

    String getMovieByTheMovieDBShowId(String apiKey, String movieId) throws IOException;

    String getMovieByMovieId(String apiKey, String movieId) throws IOException;

    String getGuideBoxTimeStamp(String apiKey) throws IOException;

    String getMovieByTitle(String apiKey, String movieName) throws IOException;

    String getChangedShows(String apiKey, String lastProcessTime, String limit, String pageNumber) throws IOException;

    String getDeletedShows(String apiKey, String lastProcessTime, String limit, String pageNumber) throws IOException;

    String getShowWithChangedEpisodes(String apiKey, String lastProcessTime, String limit, String pageNumber) throws IOException;

    String getChangedEpisodes(String apiKey, String lastProcessTime, String limit, String pageNumber) throws IOException;

    String getNewEpisodes(String apiKey, String lastProcessTime, String limit, String pageNumber) throws IOException;

    String getDeletedEpisodes(String apiKey, String lastProcessTime, String limit, String pageNumber) throws IOException;

    String getChangedMovies(String apiKey, String lastProcessTime, String limit, String pageNumber) throws IOException;

    String getDeletedMovies(String apiKey, String lastProcessTime, String limit, String pageNumber) throws IOException;
}
