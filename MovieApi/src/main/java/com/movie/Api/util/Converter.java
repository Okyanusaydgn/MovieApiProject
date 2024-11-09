package com.movie.Api.util;

import com.movie.Api.dto.ActorResponse;
import com.movie.Api.entity.Actor;

import java.util.ArrayList;
import java.util.List;

public class Converter {

    public static List<ActorResponse> actorResponseConvert(List<Actor> allActors) {
        List<ActorResponse> actors = new ArrayList<>();
        for (Actor actor : allActors){
            actors.add(new ActorResponse(actor.getId(),
                    actor.getFirstName(),
                    actor.getLastName(),
                    actor.getBirthDate(),
                    actor.getMovies() != null ? actor.getMovies() : new ArrayList<>()));
        }
        return actors;
    }

    public static ActorResponse actorResponseConvert(Actor actor){
        return new ActorResponse(actor.getId(),
                actor.getFirstName(),
                actor.getLastName(),
                actor.getBirthDate(),
                actor.getMovies() != null ? actor.getMovies() : new ArrayList<>());
    }

    public static ActorResponse actorCreateResponseConvert(Actor actor) {
        return new ActorResponse(actor.getId(),
                actor.getFirstName(),
                actor.getLastName(),
                actor.getBirthDate(),
                actor.getMovies() != null ? actor.getMovies() : new ArrayList<>());
    }


}
