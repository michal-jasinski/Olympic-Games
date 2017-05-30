package netgloo.controllers;

import netgloo.models.Events;
import netgloo.models.EventsRepository;
import netgloo.models.Venues;
import netgloo.models.VenuesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Michał on 30.05.2017.
 */
@Controller
@RequestMapping("/venues")
public class VenuesController {
    @Autowired
    private VenuesRepository venuesRepository;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Venues> getAll() {
        return venuesRepository.findAll();
    }

}
