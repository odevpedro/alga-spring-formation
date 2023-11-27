package com.odevpedro.algafood.domain.repository;

import com.odevpedro.algafood.domain.model.Cozinha;
import com.odevpedro.algafood.domain.model.Restaurante;

import java.util.List;

public interface RestauranteRepository {
    List<Restaurante> listar();
    Restaurante buscar(Long id);
    Restaurante salvar(Restaurante restaurante);
    void remover(Restaurante restaurante);
}
