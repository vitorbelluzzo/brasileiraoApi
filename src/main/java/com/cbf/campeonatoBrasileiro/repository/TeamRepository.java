package com.cbf.campeonatoBrasileiro.repository;

import com.cbf.campeonatoBrasileiro.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}