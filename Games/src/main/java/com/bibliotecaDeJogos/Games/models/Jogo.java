package com.bibliotecaDeJogos.Games.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
// import lombok.Setter; // A anotação @Setter foi removida/comentada

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "jogo")
@Getter
// @Setter // <-- REMOVIDA
@NoArgsConstructor
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    private String genero;

    @ManyToOne
    @JoinColumn(name = "desenvolvedora_id")
    private Desenvolvedora desenvolvedora;

    @ManyToMany(mappedBy = "jogos")
    @JsonIgnore
    private Set<UsuarioJogos> usuarios = new HashSet<>();

    // =============================================================
    // MÉTODOS SET ADICIONADOS MANUALMENTE PARA O TESTE
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    // =============================================================
    
    public Set<UsuarioJogos> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<UsuarioJogos> usuarios) {
        this.usuarios = usuarios;
    }

    public Desenvolvedora getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(Desenvolvedora desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }
}