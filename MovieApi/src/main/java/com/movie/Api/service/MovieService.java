package com.movie.Api.service;

import com.movie.Api.entity.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> findAll();

    Movie findById(long id);

    Movie save(Movie movie);

    void delete(Movie movie);

}
