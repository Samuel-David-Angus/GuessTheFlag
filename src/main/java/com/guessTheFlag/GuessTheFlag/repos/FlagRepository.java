package com.guessTheFlag.GuessTheFlag.repos;

import com.guessTheFlag.GuessTheFlag.models.Flag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlagRepository extends JpaRepository<Flag, Integer> {
    List<Flag> findBySrc(String src);
}
