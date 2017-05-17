package com.glean.controller;

import com.glean.guideBoxAccessLayer.GuideBoxDataAggregator;
import com.glean.guideBoxDataEntity.Show;
import com.glean.filter.ShowFilter;
import com.glean.repository.ShowRepo;
import com.glean.wrappers.ShowListWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@RestController
public class ShowController {

    @Autowired
    private ShowRepo showRepo;

    @Autowired
    private GuideBoxDataAggregator dataAggregator;

    @RequestMapping(value = "show/{id}", method = RequestMethod.GET)
    public Show getShow(@PathVariable(value="id") String id, @RequestParam(value="filtered") boolean isFiltered,  HttpSession session) {
        Show show = showRepo.findById(id);
        if(isFiltered){
            show = ShowFilter.getInstance().filterShowSeasonsAndEpisodesBasedOnUserStreamSources(show, SessionHelper.getInstance().getUserProfile(session).getUserStreamSources());
        }
        return show;
    }

    @RequestMapping(value = "show", method = RequestMethod.GET)
    public List<Show> getShowByTitle(@RequestParam(value="title") String title) {
        List<Show> shows = showRepo.findByTitle(title);
        return shows;
    }

    @RequestMapping(value = "guidebox/show", method = RequestMethod.GET)
    public ShowListWrapper getShowFromGuideBoxByTitle(@RequestParam(value="title") String title){
        ShowListWrapper showListWrapper = null;
        try {
            showListWrapper = dataAggregator.fetchAndAssembleShowFromGuideBox(title);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return showListWrapper;
    }

    @RequestMapping(value = "guidebox/show", method = RequestMethod.POST)
    public void addShowToGleanFromGuideBox(@RequestParam(value="id") String id){
        try {
            showRepo.save(dataAggregator.fetchAndAssembleFullShowFromGuideBox(id));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
