package com.tourguide.events.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tourguide.events.model.EventModel;

public interface EventRepository extends JpaRepository<EventModel, String>{
    
}
