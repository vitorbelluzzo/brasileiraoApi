package com.cbf.campeonatoBrasileiro.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Team home_team;
    private Team away_team;
    private Integer goals_home_team;
    private Integer goals_away_team;
    private Integer paying_audience;
    private String uuid;
}