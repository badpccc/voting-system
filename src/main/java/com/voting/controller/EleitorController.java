package com.voting.controller;

import com.voting.model.Eleitor;
import com.voting.repository.EleitorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eleitores")
public class EleitorController {

    private final EleitorRepository eleitorRepository;

    public EleitorController(EleitorRepository eleitorRepository) {
        this.eleitorRepository = eleitorRepository;
    }

    // Listar todos os eleitores
    @GetMapping
    public List<Eleitor> listarEleitores() {
        return eleitorRepository.findAll();
    }

    // Cadastrar um novo eleitor
    @PostMapping
    public Eleitor cadastrarEleitor(@RequestBody Eleitor eleitor) {
        return eleitorRepository.save(eleitor);
    }
}