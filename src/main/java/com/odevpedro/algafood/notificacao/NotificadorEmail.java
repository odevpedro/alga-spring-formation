package com.odevpedro.algafood.notificacao;

import com.odevpedro.algafood.model.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.NAO_URGENTE)
@Component
public class NotificadorEmail implements Notificador {

    public NotificadorEmail(){
        System.out.println("Notificador Email REAL");
    }

        @Override
        public void notificar(Cliente cliente, String mensagem) {
            System.out.printf("Notificando %s através do email %s usando SMTP: %s\n",
                    cliente.getNome(), cliente.getEmail(), mensagem);


        }
}
