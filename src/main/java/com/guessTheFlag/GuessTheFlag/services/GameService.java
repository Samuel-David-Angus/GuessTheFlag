package com.guessTheFlag.GuessTheFlag.services;

import com.guessTheFlag.GuessTheFlag.models.Game;
import com.guessTheFlag.GuessTheFlag.models.User;
import com.guessTheFlag.GuessTheFlag.repos.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.Optional;

@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;

    public Game newGame(String continent, User player) {
        Game game = new Game();
        game.setContinent(continent);
        game.setPlayer(player);
        return gameRepository.save(game);
    }

    public boolean completeGame(int id ,double accuracy, Duration time) {
        Optional<Game> optionalGame = gameRepository.findById(id);
        if (optionalGame.isPresent()) {
            Game game = optionalGame.get();
            game.setAccuracy(accuracy);
            game.setTime(time);
            return true;
        } else {
            // Handle the case where the game with the given id is not found
            System.out.println("what where");
            return false;
        }

    }
}
