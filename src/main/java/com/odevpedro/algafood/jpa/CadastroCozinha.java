package com.odevpedro.algafood.jpa;

import com.odevpedro.algafood.domain.model.Cozinha;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CadastroCozinha {

    @PersistenceContext
    private EntityManager manager;
    public List<Cozinha> listar(){
            //jpql
            TypedQuery<Cozinha> query = manager.createQuery("from Cozinha", Cozinha.class);
            return query.getResultList();
    }

}
