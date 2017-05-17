package com.glean.filter;

import com.glean.guideBoxDataEntity.Movie;
import com.glean.guideBoxDataEntity.Source;
import com.glean.guideBoxDataEntity.UserStreamSource;

import java.util.List;

/**
 * Created by justi on 5/13/2017.
 */
//TODO: This should probably just be a spring service instead of a singleton. Is there any advantage to non-managed singletons in Spring?
public class MovieFilter {
    //Thread safe singleton
    private static MovieFilter movieFilter;

    private MovieFilter(){}
    public static synchronized MovieFilter getInstance(){
        if(movieFilter ==null){
            movieFilter = new MovieFilter();
        }
        return movieFilter;
    }

    public boolean doesUserHaveAccessToMovie(List<UserStreamSource> userStreamSources, Movie movie){
        List<Source> sources = movie.getAllSources();
        for(UserStreamSource userStreamSource : userStreamSources){
            for(Source source : sources){
                if(userStreamSource.getId().equals(source.getId())){
                    return true;
                }
            }
        }
        return false;
    }

}
