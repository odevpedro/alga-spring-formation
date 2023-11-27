package com.odevpedro.algafood.jpa.cozinha;

import com.odevpedro.algafood.AlgafoodApplication;
import com.odevpedro.algafood.domain.model.Cozinha;
import com.odevpedro.algafood.domain.repository.CozinhaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;

import java.util.List;

public class ConsultaCozinhaMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CozinhaRepository cadastroCozinha = applicationContext.getBean(CozinhaRepository.class);
        List<Cozinha> cozinhas = cadastroCozinha.listar();

        for (Cozinha cozinha: cozinhas){
            System.out.println(cozinha.getNome());
        }
    }
}
