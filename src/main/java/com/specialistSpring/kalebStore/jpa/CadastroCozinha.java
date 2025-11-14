package com.specialistSpring.kalebStore.jpa;


import com.specialistSpring.kalebStore.di.modelo.Cozinha;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class CadastroCozinha {

    @PersistenceContext
    private EntityManager manager;

    private List<Cozinha> list(){
        return manager.createQuery("from Cozinha", Cozinha.class).getResultList();
    }

    private Cozinha buscarPorId(Long id){
        return manager.find(Cozinha.class, id);
    }

    @Transactional
    public Cozinha salvar(Cozinha cozinha){
        return manager.merge(cozinha);
    }

}
