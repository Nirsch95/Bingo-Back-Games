package com.bingo.service;

import com.bingo.domain.Game;

import java.util.List;

public interface IGameService {

    public Game save(Game game);

    public List<Game> list();
}
