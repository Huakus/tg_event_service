package com.tourguide.events.service;

import java.util.List;
import java.util.Optional;

import com.tourguide.events.model.Event;

public interface EventService {
    List<Event> getAllEvents();
    Optional<Event> getEventById(Long id);
    Event createEvent(Event event);
    Event updateEvent(Event event);
    void deleteEvent(Long id);
}
