package com.bingo.controller;

import com.bingo.domain.Player;
import com.bingo.service.PlayerService;
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
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping(path = "/player")
    public ResponseEntity<Player> save(@RequestBody Player player){
        log.info("Player to create: {}", player);
        playerService.save(player);
        return new ResponseEntity<>(player, HttpStatus.CREATED);
    }
}