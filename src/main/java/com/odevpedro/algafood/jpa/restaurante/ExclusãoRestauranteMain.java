package com.odevpedro.algafood.jpa.restaurante;

import com.odevpedro.algafood.AlgafoodApplication;
import com.odevpedro.algafood.domain.model.Cozinha;
import com.odevpedro.algafood.domain.model.Restaurante;
import com.odevpedro.algafood.domain.repository.CozinhaRepository;
import com.odevpedro.algafood.domain.repository.RestauranteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class ExclusãoRestauranteMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        RestauranteRepository cadastroRestaurante = applicationContext.getBean(RestauranteRepository.class);
        Restaurante restaurante = new Restaurante();
        restaurante.setId(1L);
        cadastroRestaurante.remover(restaurante);



    }
}
