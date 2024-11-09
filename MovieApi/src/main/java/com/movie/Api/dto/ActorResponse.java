package com.movie.Api.dto;

import com.movie.Api.entity.Movie;

import java.time.LocalDate;
import java.util.List;

public record ActorResponse(long id, String firstName, String lastName, LocalDate birthDate, List<Movie>movies) {
}
