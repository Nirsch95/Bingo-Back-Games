package com.bingo.controller;

import com.bingo.domain.Game;
import com.bingo.service.GameService;
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
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping(path = "/game")
    public ResponseEntity<Game> save(@RequestBody Game game){
        log.info("Game to create: {}", game);
        gameService.save(game);
        return new ResponseEntity<>(game, HttpStatus.CREATED);
    }
}
