package com.bibliotecaDeJogos.Games.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity @AllArgsConstructor @NoArgsConstructor
@Table
public class PerfilGamer {

    @Id @GeneratedValue
    private long id;

    @OneToOne(mappedBy = "perfilGamer", cascade = CascadeType.ALL)
    private Usuarios usuario;

    @Column(unique = true, nullable = false)
    private String nickname;

    @Column
    private int level;
}
