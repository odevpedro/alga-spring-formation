package com.odevpedro.algafood.service;

import com.odevpedro.algafood.model.Cliente;
import com.odevpedro.algafood.notificacao.NivelUrgencia;
import com.odevpedro.algafood.notificacao.Notificador;
import com.odevpedro.algafood.notificacao.NotificadorEmail;
import com.odevpedro.algafood.notificacao.TipoDoNotificador;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.ref.Cleaner;
import java.util.List;


public class AtivacaoClienteService {

    @TipoDoNotificador(NivelUrgencia.NAO_URGENTE)
    @Autowired
    private Notificador notificador;

    //@PostConstruct
    public void init(){
        System.out.println("INIT" + notificador);
    }

    //@PreDestroy
    public void destroy(){
        System.out.println("DESTROY");
    }

    public void ativar(Cliente cliente){
            cliente.ativar();
            notificador.notificar(cliente, "Seu cadastro no sistema está ativo");

        }

    }
