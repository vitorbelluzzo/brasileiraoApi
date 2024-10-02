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

    public TeamDTO RegisterTeam(TeamDTO team) throws Exception {
        Team entity = toEntity(team);
        Long newId = teamRepository.count()+1;

        if (team.getId() == null) {
            entity.setId(newId);
            entity = teamRepository.save(entity);
            return toDto(entity);
        } else {
            throw new Exception("Time já cadastrado");
        }

    }

    private Team toEntity(TeamDTO team) {
        Team entity = new Team();
        entity.setId(team.getId());
        entity.setStadium(team.getStadium());
        entity.setAcronym(team.getAcronym());
        entity.setName(team.getName());
        entity.setStateUF(team.getStateUF());
        return entity;
    }

    private TeamDTO toDto(Team entity) {
        TeamDTO dto = new TeamDTO();
        dto.setId(entity.getId());
        dto.setStadium(entity.getStadium());
        dto.setAcronym(entity.getAcronym());
        dto.setName(entity.getName());
        dto.setStateUF(entity.getStateUF());
        return dto;
    }


    public List<TeamDTO> listTeams() {
        return teamRepository.findAll().stream().map(this::toDto).collect(Collectors.toList());
    }


    public TeamDTO getTeam(Long id) {
        return toDto(teamRepository.findById(id).get());
    }

}
