package com.odevpedro.algafood.notificacao;

import com.odevpedro.algafood.model.Cliente;
import org.springframework.stereotype.Component;


public class NotificadorEmail implements Notificador {
    private boolean caixaAlta;
    private String hostServidorSMTP;

    public NotificadorEmail(String hostServidorSMTP) {
        this.hostServidorSMTP = hostServidorSMTP;
        System.out.println("Construtor NotificadorEmail chamado");
    }

    public void notificar(Cliente cliente, String mensagem) {
        if (this.caixaAlta) {
            mensagem = mensagem.toUpperCase();
        }
        System.out.printf("Notificando %s através do email %s usando SMTP %s: %s\n",
                cliente.getNome(), cliente.getEmail(), this.hostServidorSMTP, mensagem);
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }
}
