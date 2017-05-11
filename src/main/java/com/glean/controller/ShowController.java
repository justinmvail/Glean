package com.glean.controller;

import com.glean.guideBoxDataEntities.Show;
import com.glean.filter.ShowFilter;
import com.glean.repository.ShowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class ShowController {

    @Autowired
    private ShowRepo showRepo;

    @RequestMapping("show/{id}")
    public Show getShow(@PathVariable(value="id") String id, @RequestParam(value="filtered") boolean isFiltered,  HttpSession session) {
        Show show = showRepo.findById(id);
        if(isFiltered){
            show = ShowFilter.getInstance().filterShowSeasonsAndEpisodesBasedOnUserStreamSources(show, SessionHelper.getInstance().getUserProfile(session).getUserStreamSources());
        }
        return show;
    }

    @RequestMapping("show")
    public List<Show> getShowByTitle(@RequestParam(value="title") String title) {
        List<Show> shows = showRepo.findByTitle(title);
        return shows;
    }



}
