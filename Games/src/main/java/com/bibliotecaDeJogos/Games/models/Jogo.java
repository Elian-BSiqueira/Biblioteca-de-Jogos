package com.bibliotecaDeJogos.Games.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "jogo")
public class Jogo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String titulo;
	private String genero;

	@ManyToMany(mappedBy = "jogos")
	@JsonIgnore
	private Set<UsuarioJogos> usuarios = new HashSet<>();

	public Jogo() {
	}

	public Jogo(String titulo, String genero) {
		this.titulo = titulo;
		this.genero = genero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Set<UsuarioJogos> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<UsuarioJogos> usuarios) {
		this.usuarios = usuarios;
	}
}