package com.bibliotecaDeJogos.Games.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Desenvolvedora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "desenvolvedora", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Jogo> jogos;
}
