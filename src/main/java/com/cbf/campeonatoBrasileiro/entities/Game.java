package com.cbf.campeonatoBrasileiro.entities;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer goals_home_team;
    private Integer goals_away_team;
    private Integer paying_audience;
    private String uuid;

    @ManyToOne
    @JoinColumn(name ="home_team")
    private Team home_team;
    @ManyToOne
    @JoinColumn(name ="away_team")
    private Team away_team;

}

