package com.odevpedro.algafood.notificacao;

import com.odevpedro.algafood.model.Cliente;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class NotificadorSMS implements Notificador{

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notficando %s através do sms",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }
    }

