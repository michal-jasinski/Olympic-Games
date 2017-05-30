package netgloo.controllers;

import netgloo.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * A class to test interactions with the MySQL database using the UserDao class.
 *
 * @author netgloo
 */
@Controller
@RequestMapping("/events")
public class EventsController {
    @Autowired
    private EventsRepository eventsRepository;
    @Autowired
    private VenuesRepository venuesRepository;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Events> getAll() {
        return eventsRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<?> add(@RequestBody EventDTO eventDTO) {
        Events events = new Events();
        events.setEvent_name(eventDTO.getName());
        Venues venues = venuesRepository.findOne(Long.valueOf(eventDTO.getVenueId()));
        events.setVenue_id(venues);
        eventsRepository.save(events);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{eventId}", method = RequestMethod.DELETE)
    ResponseEntity<?> delete(@PathVariable long eventId) {
        eventsRepository.delete(eventId);
        return ResponseEntity.noContent().build();
    }

}
