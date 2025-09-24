package com.bibliotecaDeJogos.Games.repositories;

import com.bibliotecaDeJogos.Games.models.UsuarioJogos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioJogo extends JpaRepository<UsuarioJogos, Long> {
}