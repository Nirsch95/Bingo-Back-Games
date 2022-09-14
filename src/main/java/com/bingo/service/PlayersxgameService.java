package com.bingo.service;

import com.bingo.dao.PlayersxgameDao;
import com.bingo.domain.Playersxgame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PlayersxgameService implements IPlayersxgameService {

    @Autowired
    private PlayersxgameDao playersxgameDao;

    @Override
    @Transactional
    public Playersxgame save(Playersxgame playersxgame) {
        return playersxgameDao.save(playersxgame);
    }

}
