package com.guessTheFlag.GuessTheFlag;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Duration;

@Entity
@Data
@Table(name = "Game")
public class Game {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "continent")
    private String continent;

    @ManyToOne
    private User player;

    @Column(name = "accuracy")
    private double accuracy;

    @Column(name = "time_elapsed")
    private Duration time;
}
