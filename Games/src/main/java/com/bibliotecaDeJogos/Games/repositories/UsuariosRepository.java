package com.bibliotecaDeJogos.Games.repositories;

import com.bibliotecaDeJogos.Games.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {

}
