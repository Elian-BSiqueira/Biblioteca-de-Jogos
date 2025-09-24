package com.bibliotecaDeJogos.Games.repositories;

import com.bibliotecaDeJogos.Games.models.Desenvolvedora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesenvolvedoraRepository extends JpaRepository<Desenvolvedora, Long> {
}
