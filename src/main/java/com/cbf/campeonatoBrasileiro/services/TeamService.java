package com.cbf.campeonatoBrasileiro.services;

import com.cbf.campeonatoBrasileiro.dto.TeamDTO;
import com.cbf.campeonatoBrasileiro.entities.Team;
import com.cbf.campeonatoBrasileiro.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public void RegisterTeam(TeamDTO team) {
        Team entity = toEntity(team);
        teamRepository.save(entity);
    }

    private Team toEntity(TeamDTO team) {
        Team entity = new Team();
        team.setStadium(team.getStadium());
        team.setAcronym(team.getAcronym());
        team.setName(team.getName());
        team.setStateUF(team.getStateUF());
        return entity;
    }


    public List<Team> listTeams() {
        return teamRepository.findAll().stream().map(toEntity -> toDto(entity)).collect(Collectors.toList());
    }
    private Object toDto() {
        TeamDTO teamDTO = new Team();
        teamDTO.set
    }

    public TeamDTO getTeam(Long id) {
        return toDto(teamRepository.findById(id).get());

    }

}
