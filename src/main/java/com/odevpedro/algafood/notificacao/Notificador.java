package com.odevpedro.algafood.notificacao;

import com.odevpedro.algafood.model.Cliente;
import org.springframework.stereotype.Component;



public interface Notificador {
   public void notificar(Cliente cliente, String mensagem);
}
