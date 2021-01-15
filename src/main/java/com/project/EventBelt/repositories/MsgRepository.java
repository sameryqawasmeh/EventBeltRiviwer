package com.project.EventBelt.repositories;

import org.springframework.data.repository.CrudRepository;

import com.project.EventBelt.models.Msg;

public interface MsgRepository extends CrudRepository<Msg, Long> {

}
