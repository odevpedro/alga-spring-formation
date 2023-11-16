package com.odevpedro.algafood;

import com.odevpedro.algafood.notificacao.NotificadorEmail;
import com.odevpedro.algafood.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlgaConfig {
    //classe responsável pela definição de beans
    @Bean
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador = new NotificadorEmail("smpt.algamail.com.br");
        notificador.setCaixaAlta(false);
        return notificador;
    }

    public AtivacaoClienteService ativacaoClienteService(){
        return new AtivacaoClienteService(notificadorEmail());
    }
}
