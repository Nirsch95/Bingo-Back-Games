package com.bingo.controller;

import com.bingo.domain.Playerxgame;
import com.bingo.service.PLayerxgameService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@CrossOrigin("*")
public class PlayerxgameController {
    @Autowired
    private PLayerxgameService pLayerxgameService;

    @PostMapping(path = "/playerxgame")
    public ResponseEntity<Playerxgame> save(@RequestBody Playerxgame playerxgame){
        log.info("boardxplayer to create: {}", playerxgame);
        pLayerxgameService.save(playerxgame);
        return new ResponseEntity<>(playerxgame, HttpStatus.CREATED);
    }
}
