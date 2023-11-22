package com.odevpedro.algafood.notificacao;

import com.odevpedro.algafood.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@TipoDoNotificador(NivelUrgencia.NAO_URGENTE)
@Component
public class NotificadorEmail implements Notificador {

    @Autowired
    private NotificadorProperties properties;

    public NotificadorEmail(){

    }

        @Override
        public void notificar(Cliente cliente, String mensagem) {
            System.out.println("Host " + properties.getHsotServidor());
            System.out.println("Porta " + properties.getPortaServidor());
            System.out.println("Notificador Email REAL");
            System.out.printf("Notificando %s através do email %s usando SMTP: %s\n",
                    cliente.getNome(), cliente.getEmail(), mensagem);


        }
}
