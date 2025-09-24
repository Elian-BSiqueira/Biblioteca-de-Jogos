package com.bibliotecaDeJogos.Games.controllers;

import com.bibliotecaDeJogos.Games.models.Jogo;
import com.bibliotecaDeJogos.Games.services.JogoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoController {
	private final JogoService service;

	public JogoController(JogoService service) {
		this.service = service;
	}

	@GetMapping
	public List<Jogo> listar() {
		return service.listarTodos();
	}

	@PostMapping
	public Jogo criar(@RequestBody Jogo jogo) {
		return service.salvar(jogo);
	}

	@DeleteMapping("/{id}")

	public void deletar(@PathVariable Long id) {
		service.deletar(id);
	}
}