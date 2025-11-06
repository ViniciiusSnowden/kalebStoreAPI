package com.specialistSpring.kalebStore.di.listener;


import com.specialistSpring.kalebStore.di.notificacao.NivelUrgencia;
import com.specialistSpring.kalebStore.di.notificacao.Notificador;
import com.specialistSpring.kalebStore.di.notificacao.TipoNotificador;
import com.specialistSpring.kalebStore.di.service.ClienteAtivadorEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificaoService {

    @TipoNotificador(NivelUrgencia.NAO_URGENTE)
    @Autowired
    private Notificador notificador;

    @EventListener
    public void ClientAtivadoListener(ClienteAtivadorEvent event){
        notificador.notificar(event.getCliente(), "Seu cadastro está ativo!");
    }

}
