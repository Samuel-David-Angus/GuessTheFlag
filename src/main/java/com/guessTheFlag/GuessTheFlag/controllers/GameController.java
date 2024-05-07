package com.guessTheFlag.GuessTheFlag.controllers;

import com.guessTheFlag.GuessTheFlag.models.Game;
import com.guessTheFlag.GuessTheFlag.models.User;
import com.guessTheFlag.GuessTheFlag.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Duration;

@RestController
public class GameController {
    @Autowired
    private GameService gameService;

    @PostMapping("/newGame")
    public Game newGame(@RequestParam String continent, @RequestBody User player) {
        if (continent == null || player == null) {
            throw new IllegalArgumentException("Continent and player are required parameters.");
        } else {
            Game game = new Game();
            game.setContinent(continent);
            game.setPlayer(player);
            // Set any other properties or perform initialization here
            return game;
        }
    }

    @PutMapping("/completeGame/{id}")
    public boolean completeGame(
            @PathVariable int id,
            @RequestParam double accuracy,
            @RequestParam Duration time
    ) {
        return gameService.completeGame(id, accuracy, time);
    }
}
