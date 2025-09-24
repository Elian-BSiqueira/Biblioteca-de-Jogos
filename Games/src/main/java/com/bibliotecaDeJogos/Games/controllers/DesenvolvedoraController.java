package com.bibliotecaDeJogos.Games.controllers;

import com.bibliotecaDeJogos.Games.models.Desenvolvedora;
import com.bibliotecaDeJogos.Games.services.DesenvolvedoraService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/desenvolvedoras")
public class DesenvolvedoraController {

    private final DesenvolvedoraService service;

    public DesenvolvedoraController(DesenvolvedoraService service) {
        this.service = service;
    }

    @GetMapping
    public List<Desenvolvedora> listarTodos() {
        return service.listarTodos();
    }

    @PostMapping
    public Desenvolvedora salvar(@RequestBody Desenvolvedora desenvolvedora) {
        return service.salvar(desenvolvedora);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
