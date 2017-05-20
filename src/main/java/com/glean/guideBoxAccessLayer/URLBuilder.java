package com.glean.guideBoxAccessLayer;

import java.util.List;

/**
 * Created by justi on 5/16/2017.
 */
public interface URLBuilder {
    String buildUrlToGetShowByTelevisionDatabaseShowId(String apiKey, String showId);

    String buildUrlToGetShowByShowId(String apiKey, String showId);

    String buildUrlToGetShowByTitle(String apiKey, String showName);

    String buildUrlToGetSeasonsByShowId(String apiKey, String showId);

    String buildGetEpisodesByShowAndSeasonIdUrl(String apiKey, String showId, int seasonNumber, int startingEpisode, int episodeCount, List<String> sources, String platform, boolean includeLinks, boolean chronologicalOrder);

    String buildGetSimilarShowByIdUrl(String apiKey, String showId);

    String buildGetSubscriptionSourcesUrl(String apiKey);

    String buildGetFreeSourcesUrl(String apiKey);

    String buildUrlToGetMovieByTheMovieDBShowId(String apiKey, String movieId);

    String buildUrlToGetMovieByMovieId(String apiKey, String movieId);

    String buildUrlToGetMovieByTitle(String apiKey, String movieName);

    String buildUrlToGetGuideboxTimeStamp(String apiKey);
}
