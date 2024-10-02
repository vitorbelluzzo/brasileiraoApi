package com.cbf.campeonatoBrasileiro.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class TeamDTO {
    private Long id;
    private String name;
    private String acronym;
    private String stateUF;
    private String stadium;
}
