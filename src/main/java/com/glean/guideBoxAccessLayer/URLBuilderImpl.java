package com.glean.guideBoxAccessLayer;

/**
 * Created by justi on 12/17/2016.
 */

import org.springframework.stereotype.Service;

import java.util.List;

@Service
//TODO This class is really stupid and just makes things more difficult to update... figure out a better way to do this... even hard coded strings in better than this
//TODO I think that a String.format() could be used much more effectively inside the GuideBoxAPIAccessor class and this class should be removed.
public class URLBuilderImpl implements URLBuilder {

    public final String BASE_URL = "http://api-public.guidebox.com/v1.43/US/";
    public final String SEARCH = "search/";
    public final String TITLE = "title/";
    public final String ID = "id/";
    public final String TVDB = "tvdb/";
    public final String THE_MOVIE_DB = "themoviedb/";
    public final String SEASONS = "seasons/";
    public final String EPISODES = "episodes/";
    public final String SHOW = "show/";
    public final String MOVIE = "movie/";
    public final String RELATED = "related/";
    public final String SOURCES = "sources/";
    public final String FREE = "free/";
    public final String SUBSCRIPTION = "subscription/";
    public final String ALL = "all/";
    public final String CHRONOLOGICAL_ORDER = "?reverse_ordering=true";

    @Override
    public String buildUrlToGetShowByTelevisionDatabaseShowId(String apiKey, String showId){
        StringBuilder strBuilder = new StringBuilder(BASE_URL);
        strBuilder.append(apiKey.concat("/"));
        strBuilder.append(SEARCH);
        strBuilder.append(ID);
        strBuilder.append(TVDB);
        strBuilder.append(showId);
        return strBuilder.toString();
    }

    @Override
    public String buildUrlToGetShowByShowId(String apiKey, String showId){
        StringBuilder strBuilder = new StringBuilder(BASE_URL);
        strBuilder.append(apiKey.concat("/"));
        strBuilder.append(SHOW);
        strBuilder.append(showId.concat("/"));
        return strBuilder.toString();
    }

    @Override
    public String buildUrlToGetShowByTitle(String apiKey, String showName){
        StringBuilder strBuilder = new StringBuilder(BASE_URL);
        strBuilder.append(apiKey.concat("/"));
        strBuilder.append(SEARCH);
        strBuilder.append(TITLE);
        strBuilder.append(showName);
        return strBuilder.toString();
    }

    @Override
    public String buildUrlToGetSeasonsByShowId(String apiKey, String showId){
        StringBuilder strBuilder = new StringBuilder(BASE_URL);
        strBuilder.append(apiKey.concat("/"));
        strBuilder.append(SHOW);
        strBuilder.append(showId.concat("/"));
        strBuilder.append(SEASONS);
        return strBuilder.toString();
    }

    @Override
    public String buildGetEpisodesByShowAndSeasonIdUrl(String apiKey, String showId, int seasonNumber, int startingEpisode, int episodeCount, List<String> sources, String platform, boolean includeLinks, boolean chronologicalOrder){
        StringBuilder strBuilder = new StringBuilder(BASE_URL);
        strBuilder.append(apiKey.concat("/"));
        strBuilder.append(SHOW);
        strBuilder.append(showId.concat("/"));
        strBuilder.append(EPISODES);
        strBuilder.append(Integer.toString(seasonNumber).concat("/"));
        strBuilder.append(Integer.toString(startingEpisode).concat("/"));
        strBuilder.append(Integer.toString(episodeCount).concat("/"));
        strBuilder.append(getCommaSeparatedStringFromList(sources).concat("/"));
        strBuilder.append(platform.concat("/"));
        strBuilder.append(Boolean.toString(includeLinks));
        strBuilder.append(CHRONOLOGICAL_ORDER);
        return strBuilder.toString();
    }

    @Override
    public String buildGetSimilarShowByIdUrl(String apiKey, String showId){
        StringBuilder strBuilder = new StringBuilder(BASE_URL);
        strBuilder.append(apiKey.concat("/"));
        strBuilder.append(SHOW);
        strBuilder.append(showId.concat("/"));
        strBuilder.append(RELATED);
        return strBuilder.toString();
    }

    @Override
    public String buildGetSubscriptionSourcesUrl(String apiKey){
        StringBuilder strBuilder = new StringBuilder(BASE_URL);
        strBuilder.append(apiKey.concat("/"));
        strBuilder.append(SOURCES);
        strBuilder.append(SUBSCRIPTION);
        strBuilder.append(ALL);
        return strBuilder.toString();
    }
    @Override
    public String buildGetFreeSourcesUrl(String apiKey){
        StringBuilder strBuilder = new StringBuilder(BASE_URL);
        strBuilder.append(apiKey.concat("/"));
        strBuilder.append(SOURCES);
        strBuilder.append(FREE);
        strBuilder.append(ALL);
        return strBuilder.toString();
    }

    @Override
    public String buildUrlToGetMovieByTheMovieDBShowId(String apiKey, String movieId){
        StringBuilder strBuilder = new StringBuilder(BASE_URL);
        strBuilder.append(apiKey.concat("/"));
        strBuilder.append(SEARCH);
        strBuilder.append(MOVIE);
        strBuilder.append(ID);
        strBuilder.append(THE_MOVIE_DB);
        strBuilder.append(movieId);
        return strBuilder.toString();
    }

    @Override
    public String buildUrlToGetMovieByMovieId(String apiKey, String movieId){
        StringBuilder strBuilder = new StringBuilder(BASE_URL);
        strBuilder.append(apiKey.concat("/"));
        strBuilder.append(MOVIE);
        strBuilder.append(movieId.concat("/"));
        return strBuilder.toString();
    }

    @Override
    public String buildUrlToGetMovieByTitle(String apiKey, String movieName){
        StringBuilder strBuilder = new StringBuilder(BASE_URL);
        strBuilder.append(apiKey.concat("/"));
        strBuilder.append(SEARCH);
        strBuilder.append(MOVIE);
        strBuilder.append(TITLE);
        strBuilder.append(movieName);
        return strBuilder.toString();
    }


    private String getCommaSeparatedStringFromList(List<String> list){
        StringBuilder strBuilder = new StringBuilder();
        for(int i=0; i<list.size(); i++){
            strBuilder.append(list.get(i));
            if(i<list.size()-1){
                strBuilder.append(",");
            }
        }
        return strBuilder.toString();
    }
}
