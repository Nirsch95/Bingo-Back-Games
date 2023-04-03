package com.bingo.service;

import com.bingo.dao.PlayerxgameDao;
import com.bingo.domain.Playerxgame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PLayerxgameService implements IPlayerxgameService{

    @Autowired
    private PlayerxgameDao playerxgameDao;

    @Override
    @Transactional
    public Playerxgame save(Playerxgame playerxgame) {
        return playerxgameDao.save(playerxgame);
    }

}
