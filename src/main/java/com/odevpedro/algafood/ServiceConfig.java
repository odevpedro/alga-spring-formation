package com.odevpedro.algafood;

import com.odevpedro.algafood.notificacao.Notificador;
import com.odevpedro.algafood.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Primary
@Configuration
public class ServiceConfig {
    @Bean
    public AtivacaoClienteService ativacaoClienteService(Notificador notificador){
            return  new AtivacaoClienteService(notificador);
        }
    }
