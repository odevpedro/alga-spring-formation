package com.odevpedro.algafood.jpa.cozinha;

import com.odevpedro.algafood.AlgafoodApplication;
import com.odevpedro.algafood.domain.model.Cozinha;
import com.odevpedro.algafood.domain.repository.CozinhaRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class BuscaCozinhaMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CozinhaRepository cadastroCozinha = applicationContext.getBean(CozinhaRepository.class);
        Cozinha cozinha = cadastroCozinha.buscar(1L);
            System.out.println(cozinha.getNome());
    }
}
