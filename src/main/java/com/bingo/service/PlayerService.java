package com.bingo.service;

import com.bingo.dao.PlayerDao;
import com.bingo.domain.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PlayerService implements IPlayerService{

    @Autowired
    private PlayerDao playerDao;


    @Override
    @Transactional
    public Player save(Player player) {
        return playerDao.save(player);
    }

}
