package com.bibliotecaDeJogos.Games.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@NoArgsConstructor
public class UsuarioJogos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String email;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "usuario_jogo", joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "jogo_id"))
	private Set<Jogo> jogos = new HashSet<>();

	public void adicionarJogo(Jogo jogo) {
		this.jogos.add(jogo);
		jogo.getUsuarios().add(this);
	}

	public void removerJogo(Jogo jogo) {
		this.jogos.remove(jogo);
		jogo.getUsuarios().remove(this);
	}
}