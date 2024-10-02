package com.cbf.campeonatoBrasileiro.services;

import com.cbf.campeonatoBrasileiro.repository.GameRepository;
import com.cbf.campeonatoBrasileiro.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;
    @Autowired
    TeamRepository teamRepository;

    public void generateGames() {
        teamRepository.findAll();
    }
}
