package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.models.EventEntity;
import project.repository.EventRepository;

import java.util.Date;
import java.util.List;

@Service
public class EventServiceImpl implements EventServiceInter{

    @Autowired
    private EventRepository eventRepository;

    @Override
    public EventEntity createEvent(EventEntity event) {
        event.setCreated(new Date());
        return eventRepository.save(event);
    }

    @Override
    public List<EventEntity> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public EventEntity updateEventPut(Long id, EventEntity event) {
        EventEntity existingEvent = eventRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Event not found"));
        existingEvent.setTitle(event.getTitle());
        existingEvent.setBody(event.getBody());
        existingEvent.setMini_body(event.getMini_body());
        existingEvent.setType(event.getType());
        existingEvent.setCategorie(event.getCategorie());
        existingEvent.setLieu(event.getLieu());
        existingEvent.setTime(event.getTime());
        existingEvent.setCapacite_max(event.getCapacite_max());
        existingEvent.setJour_debut(event.getJour_debut());
        existingEvent.setMois_debut(event.getMois_debut());
        existingEvent.setAnnee_debut(event.getAnnee_debut());
        existingEvent.setDate_fin(event.getDate_fin());
        existingEvent.setPrix(event.getPrix());
        return eventRepository.save(existingEvent);
    }

    @Override
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

    @Override
    public EventEntity getEventById(Long eventId) {
        return eventRepository.findById(eventId).orElse(null);
    }

    @Override
    public long countEvents() {
        return eventRepository.count();
    }

}
