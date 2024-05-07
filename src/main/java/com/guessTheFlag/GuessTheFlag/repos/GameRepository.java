package com.guessTheFlag.GuessTheFlag.repos;

import com.guessTheFlag.GuessTheFlag.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {
}
