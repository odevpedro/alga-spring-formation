package com.odevpedro.algafood.di;

import com.odevpedro.algafood.model.Cliente;
import com.odevpedro.algafood.notificacao.Notificador;
import com.odevpedro.algafood.notificacao.NotificadorEmail;
import com.odevpedro.algafood.notificacao.NotificadorSMS;
import com.odevpedro.algafood.service.AtivacaoClienteService;

public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente("João", "joao@xyz.com", "0980432");
        Cliente maria = new Cliente("João", "joao@xyz.com", "0980432");


        Notificador notificador = new NotificadorEmail();


        AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
        ativacaoCliente.ativar(maria);
        ativacaoCliente.ativar(joao);
    }
}
