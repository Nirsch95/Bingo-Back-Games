package com.bingo.service;

import com.bingo.dao.PlayersxgameDao;
import com.bingo.domain.Playersxgame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class PlayersxgameService implements IPlayersxgameService {

    @Autowired
    private PlayersxgameDao playersxgameDao;
    @Override
    @Transactional(readOnly = true)
    public List<Playersxgame> list() {
        return (List<Playersxgame>) playersxgameDao.findAll() ;
    }
    @Override
    @Transactional
    public Playersxgame save(Playersxgame playersxgame) {
        return playersxgameDao.save(playersxgame);
    }

}
