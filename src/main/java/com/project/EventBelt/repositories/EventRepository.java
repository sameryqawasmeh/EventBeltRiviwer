package com.project.EventBelt.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.EventBelt.models.Event;


public interface EventRepository extends CrudRepository<Event, Long>{
	List<Event> findByState(String state);
	List<Event> findByStateIsNot(String state);
}