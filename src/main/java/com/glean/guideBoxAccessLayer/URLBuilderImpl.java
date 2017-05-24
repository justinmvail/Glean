package com.glean.guideBoxAccessLayer;

/**
 * Created by justi on 12/17/2016.
 */

import org.springframework.stereotype.Service;

import java.util.List;

@Service
//TODO This class is really stupid and just makes things more difficult to update... figure out a better way to do this... even hard coded strings in better than this
//TODO I think that a String.format() could be used much more effectively inside the GuideBoxAPIAccessor class and this class should be removed.
//TODO Also, I wrote this on api 1.43.  Version 2 has been released... just another reason to redo this.
public class URLBuilderImpl implements URLBuilder {

    public final String BASE_URL = "http://api-public.guidebox.com/v1.43/US/";

    //resources
    public final String ALL = "all/";
    public final String CHANGED_EPISODES = "changed_episodes/";
    public final String CHANGES = "changes/";
    public final String DELETES = "deletes/";
    public final String EPISODES = "episodes/";
    public final String FREE = "free/";
    public final String GET_CURRENT_TIME = "get_current_time/";
    public final String ID = "id/";
    public final String MOVIE = "movie/";
    public final String MOVIES = "movies/";
    public final String NEW = "new/";
    public final String RELATED = "related/";
    public final String SEARCH = "search/";
    public final String SEASONS = "seasons/";
    public final String SHOW = "show/";
    public final String SHOWS = "shows/";
    public final String SOURCES = "sources/";
    public final String SUBSCRIPTION = "subscription/";
    public final String THE_MOVIE_DB = "themoviedb/";
    public final String TITLE = "title/";
    public final String TVDB = "tvdb/";
    public final String UPDATES = "updates/";

    //query parameters
    public final String CHRONOLOGICAL_ORDER = "?reverse_ordering=true";
    public final String LIMIT = "?limit=";
    public final String PAGE = "&page=";




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

    @Override
    public String buildUrlToGetGuideboxTimeStamp(String apiKey){
        StringBuilder stringBuilder = new StringBuilder(BASE_URL);
        stringBuilder.append(apiKey.concat("/"));
        stringBuilder.append(UPDATES);
        stringBuilder.append(GET_CURRENT_TIME);
        return stringBuilder.toString();
    }

//    Show Changes
//    Show IDs are listed here when any basic show data changes (i.e. overview, related images, etc). Please note that if any child data changes (i.e. an episode), that will not be reflected here.
//    {Base API URL} /updates/shows/changes/ {last process time} ?limit= {limit (max 1000)} &page= {page #}
    @Override
    public String buildUrlToGetChangedShows(String apiKey, String lastProcessTime, String limit, String pageNumber){
        StringBuilder stringBuilder = new StringBuilder(BASE_URL);
        stringBuilder.append(apiKey.concat("/"));
        stringBuilder.append(UPDATES);
        stringBuilder.append(SHOWS);
        stringBuilder.append(CHANGES);
        stringBuilder.append(lastProcessTime);
        stringBuilder.append(LIMIT.concat(limit));
        stringBuilder.append(PAGE.concat(pageNumber));
        return stringBuilder.toString();
    }

//    Deleted Shows
//    Show IDs are listed here when they are completely deleted from Guidebox. Please note: since the show was deleted, calling it in the API via the /show call will return FALSE.
//    {Base API URL} /updates/shows/deletes/ {last process time} ?limit= {limit (max 1000)} &page= {page #}
    @Override
    public String buildUrlToGetDeletedShows(String apiKey, String lastProcessTime, String limit, String pageNumber){
        StringBuilder stringBuilder = new StringBuilder(BASE_URL);
        stringBuilder.append(apiKey.concat("/"));
        stringBuilder.append(UPDATES);
        stringBuilder.append(SHOWS);
        stringBuilder.append(DELETES);
        stringBuilder.append(lastProcessTime);
        stringBuilder.append(LIMIT.concat(limit));
        stringBuilder.append(PAGE.concat(pageNumber));
        return stringBuilder.toString();
    }

//    Changed Episodes for a show
//    Show IDs are listed here when they have changed episodes (i.e. when a episode is removed from or added to a streaming or download source or any episode metadata changes).
//    {Base API URL} /updates/shows/changed_episodes/ {last process time} ?limit= {limit (max 1000)} &page= {page #}
    @Override
    public String buildUrlToGetShowWithChangedEpisodes(String apiKey, String lastProcessTime, String limit, String pageNumber){
        StringBuilder stringBuilder = new StringBuilder(BASE_URL);
        stringBuilder.append(apiKey.concat("/"));
        stringBuilder.append(UPDATES);
        stringBuilder.append(SHOWS);
        stringBuilder.append(CHANGED_EPISODES);
        stringBuilder.append(lastProcessTime);
        stringBuilder.append(LIMIT.concat(limit));
        stringBuilder.append(PAGE.concat(pageNumber));
        return stringBuilder.toString();
    }

//    Episode Changes
//    Episode IDs are listed here when any episode data changes (i.e. when a episode is removed from or added to a streaming or download source or any episode metadata changes). You can retrieve all episodes, or filter by a particular show.
//    {Base API URL} /updates/episodes/changes/ {last process time} / {show ID (optional)} ?limit= {limit (max 1000)} &page= {page #}
    @Override
    public String buildUrlToGetChangedEpisodes(String apiKey, String lastProcessTime, String limit, String pageNumber){
        StringBuilder stringBuilder = new StringBuilder(BASE_URL);
        stringBuilder.append(apiKey.concat("/"));
        stringBuilder.append(UPDATES);
        stringBuilder.append(EPISODES);
        stringBuilder.append(CHANGES);
        stringBuilder.append(lastProcessTime);
        stringBuilder.append(LIMIT.concat(limit));
        stringBuilder.append(PAGE.concat(pageNumber));
        return stringBuilder.toString();
    }

//    New Episodes
//    New episode IDs are listed here when they are added to Guidebox.
//    {Base API URL} /updates/episodes/new/ {last process time} / {show ID (optional)} ?limit= {limit (max 1000)} &page= {page #}
    @Override
    public String buildUrlToGetNewEpisodes(String apiKey, String lastProcessTime, String limit, String pageNumber){
        StringBuilder stringBuilder = new StringBuilder(BASE_URL);
        stringBuilder.append(apiKey.concat("/"));
        stringBuilder.append(UPDATES);
        stringBuilder.append(EPISODES);
        stringBuilder.append(NEW);
        stringBuilder.append(lastProcessTime);
        stringBuilder.append(LIMIT.concat(limit));
        stringBuilder.append(PAGE.concat(pageNumber));
        return stringBuilder.toString();
    }

//    Deleted Episodes
//    Episode IDs are listed here when they are completely deleted from Guidebox. Please note: since the episode was deleted, calling it in the API via the /episode call will return FALSE.
//    {Base API URL} /updates/episodes/deletes/ {last process time} ?limit= {limit (max 1000)} &page= {page #}
    @Override
    public String buildUrlToGetDeletedEpisodes(String apiKey, String lastProcessTime, String limit, String pageNumber){
        StringBuilder stringBuilder = new StringBuilder(BASE_URL);
        stringBuilder.append(apiKey.concat("/"));
        stringBuilder.append(UPDATES);
        stringBuilder.append(EPISODES);
        stringBuilder.append(DELETES);
        stringBuilder.append(lastProcessTime);
        stringBuilder.append(LIMIT.concat(limit));
        stringBuilder.append(PAGE.concat(pageNumber));
        return stringBuilder.toString();
    }


//    Movie Changes
//    Movie IDs are listed here when any movie data changes (i.e. when a movie is removed from or added to a streaming or download source or any metadata changes).
//    {Base API URL} /updates/movies/changes/ {last process time} ?limit= {limit (max 1000)} &page= {page #}
    @Override
    public String buildUrlToGetChangedMovies(String apiKey, String lastProcessTime, String limit, String pageNumber){
        StringBuilder stringBuilder = new StringBuilder(BASE_URL);
        stringBuilder.append(apiKey.concat("/"));
        stringBuilder.append(UPDATES);
        stringBuilder.append(MOVIES);
        stringBuilder.append(DELETES);
        stringBuilder.append(lastProcessTime);
        stringBuilder.append(LIMIT.concat(limit));
        stringBuilder.append(PAGE.concat(pageNumber));
        return stringBuilder.toString();
    }

//    Deleted Movies
//    Movie IDs are listed here when they are completely deleted from Guidebox. Please note: since the movie was deleted, calling it in the API via the /movie call will return FALSE.
//    {Base API URL} /updates/movies/deletes/ {last process time} ?limit= {limit (max 1000)} &page= {page #}
    @Override
    public String buildUrlToGetDeletedMovies(String apiKey, String lastProcessTime, String limit, String pageNumber){
        StringBuilder stringBuilder = new StringBuilder(BASE_URL);
        stringBuilder.append(apiKey.concat("/"));
        stringBuilder.append(UPDATES);
        stringBuilder.append(MOVIES);
        stringBuilder.append(DELETES);
        stringBuilder.append(lastProcessTime);
        stringBuilder.append(LIMIT.concat(limit));
        stringBuilder.append(PAGE.concat(pageNumber));
        return stringBuilder.toString();
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
