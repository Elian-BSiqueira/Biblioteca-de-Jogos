package com.bibliotecaDeJogos.Games.services;

import com.bibliotecaDeJogos.Games.models.Usuarios;
import com.bibliotecaDeJogos.Games.repositories.UsuariosRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class UsuariosService {

    private final UsuariosRepository repository;

    public List<Usuarios> listarUsuarios() {
        return repository.findAll();
    }

    public Usuarios salvar(Usuarios usuario) {
        return repository.save(usuario);
    }

}
