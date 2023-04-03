package com.bingo.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "board")
public class Board implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "position")
    private Integer position;

    @Column(name = "num")
    private Integer num;

    @Column(name = "is_played")
    private Boolean isPlayed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "playerxgame_id", referencedColumnName = "id")
    @JsonBackReference(value = "playerxgameRef")
    private Playerxgame playerxgame;

}