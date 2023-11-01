package com.odevpedro.algafood.notificacao;

import com.odevpedro.algafood.model.Cliente;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class NotificadorEmail implements Notificador{


    public NotificadorEmail(){
        System.out.println("Construtor notificadorEmail chamado");
    }

    public void notificar(Cliente cliente, String mensagem) {
            System.out.printf("Notficando %s através do email, usando SMPT",
                    cliente.getNome(), cliente.getEmail(), mensagem);
        }
}
