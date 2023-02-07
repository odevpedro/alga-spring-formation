package com.odevpedro.algafood.service;

import com.odevpedro.algafood.model.Cliente;
import com.odevpedro.algafood.notificacao.NotificadorEmail;

public class AtivacaoClienteService {
    public void ativar(Cliente cliente){
        cliente.ativar();
        NotificadorEmail notificador = new NotificadorEmail();
        notificador.notificar(cliente,"Seu cadastro no sistema esta ativo");

    }
}
