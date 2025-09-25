package com.bibliotecaDeJogos.Games.services;

import com.bibliotecaDeJogos.Games.models.Desenvolvedora;
import com.bibliotecaDeJogos.Games.repositories.DesenvolvedoraRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesenvolvedoraService {

    private final DesenvolvedoraRepository repository;

    public DesenvolvedoraService(DesenvolvedoraRepository repository) {
        this.repository = repository;
    }

    public List<Desenvolvedora> listarTodos() {
        return repository.findAll();
    }

    public Desenvolvedora salvar(Desenvolvedora desenvolvedora) {
        return repository.save(desenvolvedora);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}