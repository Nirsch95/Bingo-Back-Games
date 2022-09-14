package com.bingo.controller;

import com.bingo.domain.Playersxgame;
import com.bingo.service.PlayersxgameService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@Slf4j
@RestController
@CrossOrigin("*")
public class PlayersxgameController {

    @Autowired
    private PlayersxgameService playersxgameService;

    @PostMapping(path = "/playersxgame")
    public ResponseEntity<Playersxgame> save(@RequestBody Playersxgame playersxgame){
        log.info("Playersxgame to create: {}", playersxgame);
        playersxgameService.save(playersxgame);
        return new ResponseEntity<>(playersxgame, HttpStatus.CREATED);
    }
}
