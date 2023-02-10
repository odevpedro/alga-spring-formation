package com.odevpedro.algafood.notificacao;

import com.odevpedro.algafood.model.Cliente;

public interface Notificador {
   public void notificar(Cliente cliente, String mensagem);

   //Todos os recursos que chamam notificador usam cliente e uma string como insumo.
}
