package com.bingo.service;

import com.bingo.dao.BoardDao;
import com.bingo.domain.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class BoardService implements IBoardService {

    @Autowired
    private BoardDao boardDao;
    @Override
    @Transactional(readOnly = true)
    public List<Board> list() {
        return (List<Board>) boardDao.findAll() ;
    }
    @Override
    @Transactional
    public Board save(Board board) {
        return boardDao.save(board);
    }

}
