package com.guessTheFlag.GuessTheFlag.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Leaderboard")
public class Leaderboard {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "continent")
    private String continent;
}
