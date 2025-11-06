package com.specialistSpring.kalebStore.di.notificacao;

import com.specialistSpring.kalebStore.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@TipoNotificador(NivelUrgencia.NAO_URGENTE)
@Component
public class NotificadorEmail implements Notificador {

    private boolean caixaAlta;

    @Value("${notficador.email.host-servidor}")
    private  String Host;

    @Value("${notficador.email.porta-servidor}")
    private Integer porta;


    @Override
    public void notificar(Cliente cliente, String mensagem) {
    System.out.println("Host: " + Host);
    System.out.println("Porta: " + porta);

        System.out.println("Notificando " + cliente.getNome() + cliente.getEndereco() +" por e-mail: " + mensagem);
    }
}
