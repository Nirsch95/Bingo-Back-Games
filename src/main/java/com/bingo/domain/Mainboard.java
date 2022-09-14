package com.bingo.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "mainboards")
public class Mainboard implements Serializable {

    @Id
    @Column(name = "mainboard_id", nullable = false)
    private Integer id;

    @Column(name = "number_played")
    private Integer numberPlayed;

    @Column(name = "game_id")
    private Integer gameId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumberPlayed() {
        return numberPlayed;
    }

    public void setNumberPlayed(Integer numberPlayed) {
        this.numberPlayed = numberPlayed;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }
}