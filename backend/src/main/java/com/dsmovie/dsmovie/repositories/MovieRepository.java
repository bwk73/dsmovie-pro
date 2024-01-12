package com.dsmovie.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsmovie.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
