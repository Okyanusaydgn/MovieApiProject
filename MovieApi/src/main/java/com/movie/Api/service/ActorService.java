package com.movie.Api.service;

import com.movie.Api.entity.Actor;

import java.util.List;

public interface ActorService {

    List<Actor> findAll();

    Actor findById(long id);

    Actor save(Actor actor);

    void delete(Actor actor);


}
