package com.bingo.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "playerxgame")
public class Playerxgame implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "is_winner", length = 25)
    private Boolean isWinner;

    @Column(name = "player", length = 25)
    private String player;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_id", referencedColumnName = "id")
    @JsonBackReference(value = "gameRef")
    private Game game;

    @OneToMany(mappedBy = "playerxgame" ,cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference(value = "playerxgameRef")
    private List<Board> boards;
}
