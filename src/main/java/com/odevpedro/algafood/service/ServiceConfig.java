package com.odevpedro.algafood.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Essa é uma das maneiras de trazer um log do ciclo de vida dos beans
//Destroy só é chamado quando paramos a aplicação(ou seja destruindo)
@Configuration
public class ServiceConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public AtivacaoClienteService ativacaoClienteService(){
        return new AtivacaoClienteService();
    }
}
