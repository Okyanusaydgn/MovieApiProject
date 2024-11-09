package com.movie.Api.dto;

import com.movie.Api.entity.Actor;
import com.movie.Api.entity.Movie;
import lombok.Data;

import java.util.List;

@Data
public class ActorRequest {

    private List<Movie> movies;
    private Actor actor;
}
