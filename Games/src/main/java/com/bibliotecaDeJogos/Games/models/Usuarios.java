package com.bibliotecaDeJogos.Games.models;

import jakarta.persistence.*;

@Entity
public class Usuarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String senha;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "perfil_gamer_id")
	private PerfilGamer perfilGamer;

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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public PerfilGamer getPerfilGamer() {
		return perfilGamer;
	}

	public void setPerfilGamer(PerfilGamer perfilGamer) {
		this.perfilGamer = perfilGamer;
	}
}