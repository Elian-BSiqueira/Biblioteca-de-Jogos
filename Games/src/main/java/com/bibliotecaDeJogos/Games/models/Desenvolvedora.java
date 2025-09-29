package com.bibliotecaDeJogos.Games.models;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "desenvolvedora")
public class Desenvolvedora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@OneToMany(mappedBy = "desenvolvedora", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Jogo> jogos = new ArrayList<>();

	public Desenvolvedora() {
	}

	public Desenvolvedora(String nome) {
		this.nome = nome;
	}

	// Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Jogo> getJogos() {
		return jogos;
	}

	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}

	public void addJogo(Jogo jogo) {
		jogos.add(jogo);
		jogo.setDesenvolvedora(this);
	}

	public void removeJogo(Jogo jogo) {
		jogos.remove(jogo);
		jogo.setDesenvolvedora(null);
	}
}
