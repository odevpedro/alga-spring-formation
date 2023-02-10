package com.odevpedro.algafood.service;

import com.odevpedro.algafood.model.Cliente;
import com.odevpedro.algafood.notificacao.Notificador;

public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador){
        this.notificador = notificador;
    }
    public AtivacaoClienteService() {
    }

    public void ativar(Cliente cliente){
        cliente.ativar();
        this.notificador.notificar(cliente, "Seu cadastro está ativo");

    }
}
