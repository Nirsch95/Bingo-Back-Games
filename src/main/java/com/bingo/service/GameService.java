package com.bingo.service;

import com.bingo.dao.GameDao;
import com.bingo.domain.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService implements IGameService{

    @Autowired
    private GameDao gameDao;

    @Override
    @Transactional
    public Game save(Game game) {
        return gameDao.save(game);
    }

}
