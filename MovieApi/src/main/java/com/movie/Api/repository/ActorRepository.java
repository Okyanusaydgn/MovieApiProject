package com.movie.Api.repository;

import com.movie.Api.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository  extends JpaRepository<Actor,Long> {
}
