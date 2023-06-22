package com.tourguide.events.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tourguide.events.model.Event;
import com.tourguide.events.repository.EventRepository;
import com.tourguide.events.service.EventService;

@Service
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}
