package com.bibliotecaDeJogos.Games.controllers;


import com.bibliotecaDeJogos.Games.models.Usuarios;
import com.bibliotecaDeJogos.Games.services.UsuariosService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@AllArgsConstructor
public class UsuariosController {

    private final UsuariosService service;

    @GetMapping
    public List<Usuarios> listar() {
        return service.listarUsuarios();
    }

    @PostMapping
    public Usuarios criar(@RequestBody Usuarios usuario) {
        return service.salvar(usuario);
    }

}
