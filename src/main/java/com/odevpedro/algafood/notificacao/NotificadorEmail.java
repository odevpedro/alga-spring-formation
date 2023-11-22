package com.odevpedro.algafood.notificacao;

import com.odevpedro.algafood.model.Cliente;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@TipoDoNotificador(NivelUrgencia.NAO_URGENTE)
@Component
public class NotificadorEmail implements Notificador {

    @Value("${notificador.email.host-servidor}")
    private String host;
    @Value("${notificador.email.porta-servidor}")
    private Integer porta;
    public NotificadorEmail(){

    }

        @Override
        public void notificar(Cliente cliente, String mensagem) {
            System.out.println("Host " + host);
            System.out.println("Porta " + porta);
            System.out.println("Notificador Email REAL");
            System.out.printf("Notificando %s através do email %s usando SMTP: %s\n",
                    cliente.getNome(), cliente.getEmail(), mensagem);


        }
}
