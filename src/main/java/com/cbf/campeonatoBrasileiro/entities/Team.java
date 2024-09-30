package com.cbf.campeonatoBrasileiro.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "teams")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30)
    private String name;
    @Column(length = 4)
    private String acronym;
    @Column(length = 2)
    private String stateUF;
    @Column
    private String stadium;
}