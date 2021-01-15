package com.project.EventBelt.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.EventBelt.models.EventUser;

@Repository
public interface UserRepository extends CrudRepository<EventUser, Long>{
	EventUser findByEmail(String email);
}