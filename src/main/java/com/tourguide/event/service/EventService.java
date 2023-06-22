package com.tourguide.event.service;

import java.util.List;
import java.util.Optional;

import com.tourguide.event.model.Event;

public interface EventService {
    List<Event> getAllEvents();
    Optional<Event> getEventById(Long id);
    Event createEvent(Event event);
    Event updateEvent(Event event);
    void deleteEvent(Long id);
}
