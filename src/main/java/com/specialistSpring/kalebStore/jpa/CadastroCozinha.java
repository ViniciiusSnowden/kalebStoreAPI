package com.specialistSpring.kalebStore.jpa;


import com.specialistSpring.kalebStore.di.modelo.Cozinha;
import org.springframework.data.annotation.Persistent;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
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

}
