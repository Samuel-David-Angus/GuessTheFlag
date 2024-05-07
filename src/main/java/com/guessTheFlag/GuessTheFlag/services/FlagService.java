package com.guessTheFlag.GuessTheFlag.services;

import com.guessTheFlag.GuessTheFlag.models.Flag;
import com.guessTheFlag.GuessTheFlag.repos.FlagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlagService {
    @Autowired
    private FlagRepository flagRepository;

    public List<Flag> findBySrc(String src) {
        return flagRepository.findBySrc(src);
    }
}
