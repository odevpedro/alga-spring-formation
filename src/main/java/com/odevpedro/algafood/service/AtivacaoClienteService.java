package com.odevpedro.algafood.service;

import com.odevpedro.algafood.model.Cliente;
import com.odevpedro.algafood.notificacao.NivelUrgencia;
import com.odevpedro.algafood.notificacao.Notificador;
import com.odevpedro.algafood.notificacao.NotificadorEmail;
import com.odevpedro.algafood.notificacao.TipoDoNotificador;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.lang.ref.Cleaner;
import java.util.List;


@Component
public class AtivacaoClienteService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void ativar(Cliente cliente){
            cliente.ativar();
            eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
        }

    }
