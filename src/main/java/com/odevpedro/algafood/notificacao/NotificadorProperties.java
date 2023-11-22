package com.odevpedro.algafood.notificacao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("notificador.email")
public class NotificadorProperties {
    private String hostServidor;
    private Integer portaServidor;


    public String getHostServidor() {
        return hostServidor;
    }

    public void setHostServidor(String hsotServidor) {
        this.hostServidor = hsotServidor;
    }

    public Integer getPortaServidor() {
        return portaServidor;
    }

    public void setPortaServidor(Integer portaServidor) {
        this.portaServidor = portaServidor;
    }
}
