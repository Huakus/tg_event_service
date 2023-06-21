package com.tourguide.events.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tourguide.events.model.EventModel;
import com.tourguide.events.repository.EventRepository;
import com.tourguide.events.service.EventService;

public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<EventModel> getAllEvents() {
        return eventRepository.findAll();
    }
}
