package com.guessTheFlag.GuessTheFlag.services;

import com.guessTheFlag.GuessTheFlag.models.User;
import com.guessTheFlag.GuessTheFlag.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        // Additional logic for user registration (e.g., validation, encryption)
        return userRepository.save(user);
    }

    public User loginUser(String email, String password) {
        Optional<User> optionalUser = userRepository.findByEmail(email);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            if (user.getPassword().equals(password)) {
                return user;
            } else {
                return null; // or throw an exception indicating login failure
            }
        }
        return null;
    }
}
