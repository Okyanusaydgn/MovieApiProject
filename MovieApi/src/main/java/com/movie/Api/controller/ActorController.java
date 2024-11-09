package com.movie.Api.controller;

import com.movie.Api.dto.ActorRequest;
import com.movie.Api.dto.ActorResponse;
import com.movie.Api.entity.Actor;
import com.movie.Api.entity.Movie;
import com.movie.Api.service.ActorService;
import com.movie.Api.util.Converter;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/workintech/actor")
public class ActorController {

    private final ActorService actorService;


    @GetMapping
    public List<ActorResponse> findAll(){
        List<Actor> allActors = actorService.findAll();
        return Converter.actorResponseConvert(allActors);
    }

    @GetMapping("/{id}")
    public ActorResponse findById(@PathVariable long id){
        return Converter.actorResponseConvert(actorService.findById(id));
    }


    @PostMapping
    public ActorResponse save(@Validated @RequestBody ActorRequest actorRequest){
        System.out.println("Received ActorRequest: " + actorRequest);
        List<Movie> movies = actorRequest.getMovies();
        Actor actor = actorRequest.getActor();
        for (Movie movie : movies){
            actor.addMovie(movie);
        }
        actorService.save(actor);
        return Converter.actorCreateResponseConvert(actor);
    }

    @PutMapping("/{id}")
    public ActorResponse update(@RequestBody Actor actor,@PathVariable Long id){
        Actor foundActor = actorService.findById(id);

        foundActor.setFirstName(actor.getFirstName());
        foundActor.setLastName(actor.getLastName());
        foundActor.setBirthDate(actor.getBirthDate());
        foundActor.setGender(actor.getGender());

        foundActor.setMovies(actor.getMovies());


        actorService.save(foundActor);
        return Converter.actorResponseConvert(foundActor);
    }

    @DeleteMapping("/{id}")
    public ActorResponse delete(@PathVariable long id){
        Actor foundActor = actorService.findById(id);
        actorService.delete(foundActor);
        return Converter.actorResponseConvert(foundActor);
    }

}
