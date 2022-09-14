package com.bingo.dao;

import com.bingo.domain.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerDao extends CrudRepository<Player, String> {
}
