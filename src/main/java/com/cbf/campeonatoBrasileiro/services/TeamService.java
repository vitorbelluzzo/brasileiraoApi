package com.cbf.campeonatoBrasileiro.services;

import com.cbf.campeonatoBrasileiro.entities.Team;
import com.cbf.campeonatoBrasileiro.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public void RegisterTeam(Team team) {
    teamRepository.save(team);
    }

    public List<Team> listTeams() {
        return teamRepository.findAll();
    }

    public Team getTeam(Long id) {
        return teamRepository.findById(id).get();

    }

}
