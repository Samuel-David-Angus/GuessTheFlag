package com.guessTheFlag.GuessTheFlag.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Flag")
@NoArgsConstructor
public class Flag {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "src")
    private String src;

    @Column(name = "country_code")
    private String country_code;

    public Flag(String name, String src, String country_code) {
        this.name = name;
        this.src = src;
        this.country_code = country_code;
    }
}
