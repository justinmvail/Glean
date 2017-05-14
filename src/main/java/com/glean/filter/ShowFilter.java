package com.glean.filter;

import com.glean.guideBoxDataEntities.*;

import java.util.Iterator;
import java.util.List;

/**
 * Created by justi on 4/19/2017.
 */
//TODO: This should probably just be a spring service instead of a singleton. Is there any advantage to non-managed singletons in Spring?
public class ShowFilter {
    //Thread safe singleton
    private static ShowFilter showFilter;

    private ShowFilter(){}
    public static synchronized ShowFilter getInstance(){
        if(showFilter==null){
            showFilter = new ShowFilter();
        }
        return showFilter;
    }

    public Show filterShowSeasonsAndEpisodesBasedOnUserStreamSources(Show show, List<UserStreamSource> userStreamSources){
        List<Season> seasons = show.getSeasons();
        Iterator<Season> seasonIterator = seasons.iterator();
        while(seasonIterator.hasNext()){
            Season season = seasonIterator.next();
            List<Episode> episodes = season.getEpisodes();
            Iterator<Episode> episodeIterator = episodes.iterator();
            while(episodeIterator.hasNext()){
                Episode episode = episodeIterator.next();
                List<Source> sources = episode.getAllSources();//Because the getAllSources method creates a new arrayList, we don't actually delete the episode's sources
                Iterator<Source> sourceIterator = sources.iterator();
                while(sourceIterator.hasNext()){
                    Source source = sourceIterator.next();
                    boolean hasMatch = false;
                    Iterator<UserStreamSource> userStreamSourceIterator = userStreamSources.iterator();
                    while(userStreamSourceIterator.hasNext()){
                        UserStreamSource userStreamSource = userStreamSourceIterator.next();
                        if(userStreamSource.getSource().equals(source.getSource())){
                            hasMatch = true;
                        }
                    }
                    if(!hasMatch){//This episode source did not match any user's sources
                        sourceIterator.remove();
                    }
                }
                if(sources.isEmpty()){//None of the episode sources matched the user's sources
                    episodeIterator.remove();
                }
            }
            if(episodes.isEmpty()){
                seasonIterator.remove();
            }
        }
        return show;
    }

}
