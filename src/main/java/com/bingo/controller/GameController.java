package com.bingo.controller;

import com.bingo.domain.Game;
import com.bingo.service.GameService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin("*")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(path = "/game")
    public List<Game> listado(){

        var games = gameService.list();
        return games;
    }

    @PostMapping(path = "/game")
    public ResponseEntity<Game> save(@RequestBody Game game){
        log.info("Game to create: {}", game);
        gameService.save(game);
        return new ResponseEntity<>(game, HttpStatus.CREATED);
    }
}
