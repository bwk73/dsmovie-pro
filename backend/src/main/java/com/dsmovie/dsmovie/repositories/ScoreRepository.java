package com.dsmovie.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsmovie.dsmovie.entities.Score;
import com.dsmovie.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
