package com.odevpedro.algafood.notificacao;

import com.odevpedro.algafood.model.Cliente;

public class NotificadorEmail {
    public void notificar(Cliente cliente, String mensagem){
    System.out.printf("Notficando %s através do email",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
