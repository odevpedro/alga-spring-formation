package com.odevpedro.algafood.controller;

import com.odevpedro.algafood.domain.model.Estado;
import com.odevpedro.algafood.domain.repository.EstadoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class EstadoController {

    private final EstadoRepository repository;

    public EstadoController(EstadoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Estado> listar() {      
        return repository.findAll();
    }


    @PostMapping
    public Estado criaEstado(Estado estado){
        return repository.save(estado);
    }
}
