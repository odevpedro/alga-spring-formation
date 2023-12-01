package com.odevpedro.algafood.api;

import com.odevpedro.algafood.domain.model.Cozinha;
import com.odevpedro.algafood.domain.repository.CozinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cozinhas")
public class CozinhaController {

    @Autowired
    private CozinhaRepository repository;

    @GetMapping
    public List<Cozinha> listar(){
        return repository.findAll();
    }

    @GetMapping("/{cozinhaId}")
    public Optional<Cozinha> buscar(@PathVariable  Long cozinhaId){
        return repository.findById(cozinhaId);

    }

}
