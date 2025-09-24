package com.bibliotecaDeJogos.Games.services;

import com.bibliotecaDeJogos.Games.models.Jogo;
import com.bibliotecaDeJogos.Games.models.UsuarioJogos;
import com.bibliotecaDeJogos.Games.repositories.JogoRepository;
import com.bibliotecaDeJogos.Games.repositories.UsuarioJogo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class UsuarioJogoService {
	private final UsuarioJogo usuarioRepo;
	private final JogoRepository jogoRepo;

	public UsuarioJogoService(UsuarioJogo usuarioRepo, JogoRepository jogoRepo) {
		this.usuarioRepo = usuarioRepo;
		this.jogoRepo = jogoRepo;
	}

	public List<UsuarioJogos> listarTodos() {
		return usuarioRepo.findAll();
	}

	public UsuarioJogos salvar(UsuarioJogos u) {
		return usuarioRepo.save(u);
	}

	public void deletar(Long id) {
		usuarioRepo.deleteById(id);
	}

	@Transactional
	public UsuarioJogos adicionarJogo(Long usuarioId, Long jogoId) {
		UsuarioJogos u = usuarioRepo.findById(usuarioId).orElseThrow(() -> new RuntimeException("Usuario nao encontrado"));
		Jogo j = jogoRepo.findById(jogoId).orElseThrow(() -> new RuntimeException("Jogo nao encontrado"));
		u.adicionarJogo(j);
		return usuarioRepo.save(u);
	}

	@Transactional
	public UsuarioJogos removerJogo(Long usuarioId, Long jogoId) {
		UsuarioJogos u = usuarioRepo.findById(usuarioId).orElseThrow(() -> new RuntimeException("Usuario nao encontrado"));
		Jogo j = jogoRepo.findById(jogoId).orElseThrow(() -> new RuntimeException("Jogo nao encontrado"));
		u.removerJogo(j);
		return usuarioRepo.save(u);
	}
}