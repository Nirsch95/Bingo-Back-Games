package com.bingo.dao;

import com.bingo.domain.Board;
import org.springframework.data.repository.CrudRepository;

public interface BoardDao extends CrudRepository<Board, Integer> {
}
