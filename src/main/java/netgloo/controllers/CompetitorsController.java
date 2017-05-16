package netgloo.controllers;

import netgloo.models.Competitors;
import netgloo.models.CompetitorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Michał on 16.05.2017.
 */
@Controller
@RequestMapping("/competitors")
public class CompetitorsController {
    @Autowired
    private CompetitorsRepository competitorsRepository;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Competitors> getAll() {
        return competitorsRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<?> add(@RequestBody Competitors competitors) {
        competitorsRepository.save(competitors);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{competitorId}", method = RequestMethod.DELETE)
    ResponseEntity<?> delete(@PathVariable long competitorId) {
        competitorsRepository.delete(competitorId);
        return ResponseEntity.noContent().build();
    }
}

