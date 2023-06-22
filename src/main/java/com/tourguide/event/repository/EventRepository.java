package com.tourguide.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tourguide.event.model.Event;

public interface EventRepository extends JpaRepository<Event, Long>{
    
}
