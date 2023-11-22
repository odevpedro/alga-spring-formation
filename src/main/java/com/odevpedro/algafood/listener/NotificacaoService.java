package com.odevpedro.algafood.listener;

import com.odevpedro.algafood.notificacao.NivelUrgencia;
import com.odevpedro.algafood.notificacao.Notificador;
import com.odevpedro.algafood.notificacao.TipoDoNotificador;
import com.odevpedro.algafood.service.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {

    @Autowired
    @TipoDoNotificador(NivelUrgencia.NAO_URGENTE)
    private Notificador notificador;

    @EventListener()
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {
    notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo" );
    }
}
