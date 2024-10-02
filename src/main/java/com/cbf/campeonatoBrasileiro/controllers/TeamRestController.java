package com.cbf.campeonatoBrasileiro.controllers;


import com.cbf.campeonatoBrasileiro.dto.TeamDTO;
import com.cbf.campeonatoBrasileiro.services.TeamService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/teams")
public class TeamRestController {

    @Autowired
    private TeamService teamService;


    @GetMapping
    public ResponseEntity<List<TeamDTO>> getTeams() {
        return ResponseEntity.ok().body(teamService.listTeams());
    }


    @ApiOperation(value = "Get team data")
    @GetMapping(value = "{id}")
    public ResponseEntity<TeamDTO> getTeam(@PathVariable Long id) {
        return ResponseEntity.ok().body(teamService.getTeam(id));
    }


    @ApiOperation(value = "register a team")
    @PostMapping
    public ResponseEntity<TeamDTO> registerTeam(@RequestBody TeamDTO team) throws Exception {
        return ResponseEntity.ok().body(teamService.RegisterTeam(team));

    }
}
