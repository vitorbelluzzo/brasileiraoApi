package com.cbf.campeonatoBrasileiro.dto;

import lombok.Data;

@Data
public class TeamDTO {
    private Long id;
    private String name;
    private String acronym;
    private String stateUF;
    private String stadium;
}
