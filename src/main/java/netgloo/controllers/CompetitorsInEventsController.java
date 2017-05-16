package netgloo.controllers;

import netgloo.models.CompetitorsInEvents;
import netgloo.models.CompetitorsInEventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Michał on 16.05.2017.
 */

@Controller
@RequestMapping("/competitorsInEvents")
public class CompetitorsInEventsController {
    @Autowired
    private CompetitorsInEventsRepository competitorsInEventsRepository;

    @RequestMapping(value = "/events/{eventId}", method = RequestMethod.GET)
    @ResponseBody
    public List<CompetitorsInEvents> getByEventId(@PathVariable long eventId) {
        return competitorsInEventsRepository.findByIdEventId(eventId);
    }

    @RequestMapping(value = "/competitors/{competitorId}", method = RequestMethod.GET)
    @ResponseBody
    public List<CompetitorsInEvents> getByCompetitorId(@PathVariable long competitorId) {
        return competitorsInEventsRepository.findByIdCompetitorId(competitorId);
    }
}
