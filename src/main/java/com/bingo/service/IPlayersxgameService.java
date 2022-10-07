package com.bingo.service;

import com.bingo.domain.Playersxgame;
import java.util.List;

public interface IPlayersxgameService {

    public Playersxgame save(Playersxgame playersxgame);
    public List<Playersxgame> list();
}
