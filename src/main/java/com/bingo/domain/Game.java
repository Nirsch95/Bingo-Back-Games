package com.bingo.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.CascadeType;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "game")
public class Game implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "game_starts")
    private Instant gameStarts;

    @OneToMany(mappedBy = "game" ,cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference(value = "gameRefMain")
    private List<Mainboard> mainboards;

    @OneToMany(mappedBy = "game" ,cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference(value = "gameRef")
    private List<Playerxgame> playerxgames;


}