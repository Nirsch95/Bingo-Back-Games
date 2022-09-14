package com.bingo.controller;

import com.bingo.domain.Mainboard;
import com.bingo.service.MainboardService;
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
public class MainboardController {

    @Autowired
    private MainboardService mainboardService;

    @PostMapping(path = "/mainboard")
    public ResponseEntity<Mainboard> save(@RequestBody Mainboard mainboard){
        log.info("Mainboard to create: {}", mainboard);
        mainboardService.save(mainboard);
        return new ResponseEntity<>(mainboard, HttpStatus.CREATED);
    }
}
