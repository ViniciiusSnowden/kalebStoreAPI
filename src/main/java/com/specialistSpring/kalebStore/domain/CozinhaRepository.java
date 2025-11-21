package com.specialistSpring.kalebStore.domain;

import com.specialistSpring.kalebStore.di.modelo.Cozinha;

import java.util.List;

public interface CozinhaRepository {

    List<Cozinha> listarTodos();
    Cozinha buscarPorId(Long id);
    Cozinha salvar(Cozinha cozinha);
    void excluir(Long id);

}
