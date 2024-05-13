package com.guessTheFlag.GuessTheFlag.controllers;

import com.guessTheFlag.GuessTheFlag.models.Flag;
import com.guessTheFlag.GuessTheFlag.services.FlagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlagController {
    @Autowired
    private FlagService flagService;

    @GetMapping("/getFlagsBySrc")
    public List<Flag> findFlagBySrc(@RequestParam String src) {
        return flagService.findBySrc(src);
    }
}
