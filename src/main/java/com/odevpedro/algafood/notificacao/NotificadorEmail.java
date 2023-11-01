package com.odevpedro.algafood.notificacao;

import com.odevpedro.algafood.model.Cliente;
import org.springframework.stereotype.Component;

import java.util.Locale;

public class NotificadorEmail implements Notificador {

    private boolean caixaAlta;
    private String hostServidorSmtp;

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;

    }

    public NotificadorEmail(String hostServidorSmtp) {
        this.hostServidorSmtp = hostServidorSmtp;
                System.out.println("NotificadorEmail");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        if (this.caixaAlta){
            mensagem = mensagem.toUpperCase();
        }
            System.out.printf("Notficando %s através do email, usando SMPT",
                    cliente.getNome(), cliente.getEmail(), this.hostServidorSmtp, mensagem);
        }


}
