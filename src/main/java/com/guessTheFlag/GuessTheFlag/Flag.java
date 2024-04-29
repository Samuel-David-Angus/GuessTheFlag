package com.guessTheFlag.GuessTheFlag;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Flag")
public class Flag {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "src")
    private String src;

    @Column(name = "is_correct")
    private boolean is_correct;
}
