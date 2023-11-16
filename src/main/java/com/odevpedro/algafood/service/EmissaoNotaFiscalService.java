package com.odevpedro.algafood.service;

import com.odevpedro.algafood.model.Cliente;
import com.odevpedro.algafood.model.Produto;
import com.odevpedro.algafood.notificacao.Notificador;
import com.odevpedro.algafood.notificacao.NotificadorEmail;

public class EmissaoNotaFiscalService {

    private Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador){
        this.notificador = notificador;
    }
    public void emitir(Cliente cliente, Produto produto){
        this.notificador.notificar(cliente, "Nota fiscal do produto" + produto.getNome() +
                "foi emitida");
        //Emite nota fiscal ...

        NotificadorEmail notificador = new NotificadorEmail("smtp.mail.com.br");
        notificador.notificar(cliente, "Nota fiscal do produto" + produto.getNome() + "foi emitida");

        //simplesmente seguir o contrato da
    }
}
