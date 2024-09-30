package com.cbf.campeonatoBrasileiro.repository;

import com.cbf.campeonatoBrasileiro.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}