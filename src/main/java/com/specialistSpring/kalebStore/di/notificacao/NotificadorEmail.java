package com.specialistSpring.kalebStore.di.notificacao;

import com.specialistSpring.kalebStore.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;


@TipoNotificador(NivelUrgencia.NAO_URGENTE)
@Component
public class NotificadorEmail implements Notificador {


    private boolean caixaAlta;

    @Autowired
    private NotificadorProperties properties;


    @Override
    public void notificar(Cliente cliente, String mensagem) {
    System.out.println("Host: " + properties.getHostServidor());
    System.out.println("Porta: " + properties.getPortaServidor());

        System.out.println("Notificando " + cliente.getNome() + cliente.getEndereco() +" por e-mail: " + mensagem);
    }
}
