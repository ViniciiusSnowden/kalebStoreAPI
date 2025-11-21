package com.specialistSpring.kalebStore.infrastructure.repository;

import com.specialistSpring.kalebStore.di.modelo.Cozinha;
import com.specialistSpring.kalebStore.domain.CozinhaRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class CozinhaRepositoryImpl implements CozinhaRepository {


    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Cozinha> listarTodos(){
        return manager.createQuery("from Cozinha", Cozinha.class).getResultList();
    }

    @Override
    public Cozinha buscarPorId(Long id){
        return manager.find(Cozinha.class, id);
    }

    @Transactional
    @Override
    public Cozinha salvar(Cozinha cozinha){
        return manager.merge(cozinha);
    }

    @Transactional
    @Override
    public void excluir(Long id){
        Cozinha cozinha = buscarPorId(id);
        if (cozinha.getId() != null){
            manager.remove(cozinha);
        }
    }

}
