package com.bingo.controller;

import com.bingo.domain.Board;
import com.bingo.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
@Slf4j
@RestController
@CrossOrigin("*")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping(path = "/board")
    public List<Board> listado(){

        var boards = boardService.list();
        return boards;
    }

    @PostMapping(path = "/board")
    public ResponseEntity<Board> save(@RequestBody Board board){
        log.info("boardxplayer to create: {}", board);
        boardService.save(board);
        return new ResponseEntity<>(board, HttpStatus.CREATED);
    }
}
