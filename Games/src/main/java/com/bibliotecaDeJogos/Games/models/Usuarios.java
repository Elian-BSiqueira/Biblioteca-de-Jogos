package com.bibliotecaDeJogos.Games.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @AllArgsConstructor @NoArgsConstructor @Data
@Table
public class Usuarios {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String nome;

    @Column
    private String senha;

    @OneToOne
    @JoinColumn(name = "PerfilGamer_id", unique = true)
    private PerfilGamer perfilGamer;

}
