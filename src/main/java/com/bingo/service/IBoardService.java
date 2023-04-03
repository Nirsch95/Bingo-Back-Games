package com.bingo.service;

import com.bingo.domain.Board;
import java.util.List;

public interface IBoardService {

    public Board save(Board board);
    public List<Board> list();
}
