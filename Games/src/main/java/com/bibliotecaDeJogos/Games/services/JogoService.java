package com.bibliotecaDeJogos.Games.services;

import com.bibliotecaDeJogos.Games.models.Jogo;
import com.bibliotecaDeJogos.Games.repositories.JogoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JogoService {
	private final JogoRepository repository;

	public JogoService(JogoRepository repository) {
		this.repository = repository;
	}

	public List<Jogo> listarTodos() {
		return repository.findAll();
	}

	public Jogo salvar(Jogo jogo) {
		return repository.save(jogo);
	}

	public void deletar(Long id) {
		repository.deleteById(id);
	}
}