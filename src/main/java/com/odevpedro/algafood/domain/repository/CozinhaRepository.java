package com.odevpedro.algafood.domain.repository;

import com.odevpedro.algafood.domain.model.Cozinha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface CozinhaRepository extends JpaRepository<Cozinha, Long>  {
    List<Cozinha> findTodasByNomeContaining(String nome); // containing -> like query
    Cozinha findByNome(String nome);
    boolean existsByNome(String nome);
}
