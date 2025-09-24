package com.bibliotecaDeJogos.Games.repositories;

import com.bibliotecaDeJogos.Games.models.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogoRepository extends JpaRepository<Jogo, Long> {
}