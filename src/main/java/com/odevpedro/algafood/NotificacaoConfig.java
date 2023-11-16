package com.odevpedro.algafood;

import com.odevpedro.algafood.notificacao.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class NotificacaoConfig {


    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador = new NotificadorEmail("smpt.algamail.com.br");
        notificador.setCaixaAlta(false);
        return notificador;
    }

}


