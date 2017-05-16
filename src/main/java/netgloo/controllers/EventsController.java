package netgloo.controllers;

import netgloo.models.Events;
import netgloo.models.EventsRepository;
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

    @RequestMapping("/get")
    @ResponseBody
    public List<Events> getAll() {
        return eventsRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<?> add(@RequestBody Events events) {
        eventsRepository.save(events);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{eventId}", method = RequestMethod.DELETE)
    ResponseEntity<?> delete(@PathVariable long eventId) {
        eventsRepository.delete(eventId);
        return ResponseEntity.noContent().build();
    }

}
