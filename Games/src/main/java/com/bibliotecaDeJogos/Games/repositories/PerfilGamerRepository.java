package com.bibliotecaDeJogos.Games.repositories;

import com.bibliotecaDeJogos.Games.models.PerfilGamer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilGamerRepository extends JpaRepository<PerfilGamer, Long> {
}