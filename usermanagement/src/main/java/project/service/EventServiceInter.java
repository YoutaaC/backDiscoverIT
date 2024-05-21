package project.service;

import project.models.EventEntity;
import project.models.PostEntity;

import java.util.List;

public interface EventServiceInter {

    EventEntity createEvent( EventEntity event);
    List<EventEntity> getAllEvents();

    EventEntity updateEventPut(Long id, EventEntity event);

    void deleteEvent(Long id);
    EventEntity getEventById(Long eventid);

    long countEvents();
}
