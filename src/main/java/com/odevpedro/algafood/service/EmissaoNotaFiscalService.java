package com.odevpedro.algafood.service;

import com.odevpedro.algafood.model.Cliente;
import com.odevpedro.algafood.model.Produto;
import com.odevpedro.algafood.notificacao.NotificadorEmail;

public class EmissaoNotaFiscalService {
    public void emitir(Cliente cliente, Produto produto){

        //Emite nota fiscal ...

        NotificadorEmail notificador = new NotificadorEmail();
        notificador.notificar(cliente, "Nota fiscal do produto" + produto.getNome() + "foi emitida");
    }
}
