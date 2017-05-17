package com.glean.filter;

import com.glean.guideBoxDataEntity.Movie;
import com.glean.guideBoxDataEntity.Source;
import com.glean.guideBoxDataEntity.UserStreamSource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by justi on 5/13/2017.
 */
@Service
public class MovieFilterImpl implements MovieFilter {
    private static MovieFilter movieFilter;

    @Override
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
