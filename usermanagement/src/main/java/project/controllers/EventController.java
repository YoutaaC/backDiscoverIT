package project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.models.EventEntity;
import project.models.PostEntity;
import project.service.EventServiceImpl;
import project.service.EventServiceInter;
import project.service.PostServiceInter;

import java.util.List;

@RestController
@RequestMapping("/events")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EventController {
    @Autowired
    EventServiceInter eventServiceInter;

    @Autowired
    EventServiceImpl eventServiceImpl;



    @PostMapping("/add")
    public EventEntity createEvent(@RequestBody EventEntity event){

        return eventServiceInter.createEvent(event);
    }

    @GetMapping("/getAll")
    public List<EventEntity> getAllEvents()
    {
        return eventServiceInter.getAllEvents();

    }

    @PutMapping(value = "/update/{id}")
    public EventEntity updateEventPut(@PathVariable Long id , @RequestBody EventEntity event)
    {
        return eventServiceInter.updateEventPut(id,event);

    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteEvent(@PathVariable Long id)
    {

        eventServiceInter.deleteEvent(id);
    }

    @GetMapping(value = "/getEventById/{eventid}")
    public EventEntity getEventById(@PathVariable Long eventid)
    {
        return eventServiceInter.getEventById(eventid);

    }

    @GetMapping("/count")
    public long getEventCount() {
        return eventServiceImpl.countEvents();
    }


}
