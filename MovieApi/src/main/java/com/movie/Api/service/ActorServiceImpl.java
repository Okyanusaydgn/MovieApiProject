package com.movie.Api.service;

import com.movie.Api.entity.Actor;
import com.movie.Api.exceptions.ApiException;
import com.movie.Api.repository.ActorRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ActorServiceImpl implements ActorService {

    private final ActorRepository actorRepository;

    @Override
    public List<Actor> findAll() {
        return actorRepository.findAll();
    }

    @Override
    public Actor findById(long id) {
        Optional<Actor> foundActor = actorRepository.findById(id);
        if (foundActor.isPresent()){
            return foundActor.get();
        }
        throw new ApiException("actor is not found with id: "+id, HttpStatus.NOT_FOUND);
    }

    @Override
    public Actor save(Actor actor) {
        return actorRepository.save(actor);
    }

    @Override
    public void delete(Actor actor) {
        actorRepository.delete(actor);

    }
}
