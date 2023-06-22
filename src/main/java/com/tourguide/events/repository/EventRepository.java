package com.tourguide.events.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tourguide.events.model.Event;

public interface EventRepository extends JpaRepository<Event, Long>{
    
}
