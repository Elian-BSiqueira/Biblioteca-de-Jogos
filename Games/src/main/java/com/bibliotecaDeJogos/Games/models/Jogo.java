package com.bibliotecaDeJogos.Games.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String genero;

    @ManyToOne
    @JoinColumn(name = "desenvolvedora_id")
    private Desenvolvedora desenvolvedora;
}
