package com.odevpedro.algafood.infrastructure.repository;

import com.odevpedro.algafood.domain.model.Cozinha;
import com.odevpedro.algafood.domain.repository.CozinhaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CozinhaInfraestructureImpl implements CozinhaRepository {
    @Override
    public List<Cozinha> listar() {
        return null;
    }

    @Override
    public Cozinha buscar(Long id) {
        return null;
    }

    @Override
    public Cozinha salvar(Cozinha cozinha) {
        return null;
    }

    @Override
    public void remover(Cozinha cozinha) {

    }
}
