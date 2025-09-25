package com.bibliotecaDeJogos.Games.controllers;

import com.bibliotecaDeJogos.Games.models.Usuarios;
import com.bibliotecaDeJogos.Games.repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

	@Autowired
	private UsuariosRepository usuariosRepository;

	@PostMapping
	public ResponseEntity<Usuarios> salvarUsuario(@RequestBody Usuarios usuario) {
		Usuarios usuarioSalvo = usuariosRepository.save(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioSalvo);
	}

	@GetMapping
	public List<Usuarios> listarUsuarios() {
		return usuariosRepository.findAll();
	}
}