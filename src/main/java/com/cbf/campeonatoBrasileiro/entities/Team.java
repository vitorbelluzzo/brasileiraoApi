package com.cbf.campeonatoBrasileiro.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(length = 4)
    private String acronym;
    private String state;
}
