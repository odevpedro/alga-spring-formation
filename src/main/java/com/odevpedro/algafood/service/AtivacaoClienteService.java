package com.odevpedro.algafood.service;

import com.odevpedro.algafood.model.Cliente;
import com.odevpedro.algafood.notificacao.Notificador;
import com.odevpedro.algafood.notificacao.NotificadorEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AtivacaoClienteService {
    @Autowired
    private List<Notificador> notificadores;

    public void ativar(Cliente cliente){
        cliente.ativar();
        for (Notificador notifcador: notificadores){
           notifcador.notificar(cliente, "Seu cadastro no sistema está ativo");
        }
    }
}
/*
    *Exemplo de ponto de injeção artavés de um set
    * @Autowired
  	public void setNotificador(Notificador notificador ){
  	this.notificador = notificador}
    public void ativar(Cliente cliente){
        cliente.ativar();
        notificador.notificar(cliente, "Seu cadastro está ativo");
**/