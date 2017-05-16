package netgloo.controllers;

import netgloo.models.Competitors;
import netgloo.models.CompetitorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Michał on 16.05.2017.
 */
@Controller
@RequestMapping("/competitors")
public class CompetitorsController {
    @Autowired
    private CompetitorsRepository competitorsRepository;

    @RequestMapping("/get")
    @ResponseBody
    public List<Competitors> get() {
        return competitorsRepository.findAll();
    }
}

