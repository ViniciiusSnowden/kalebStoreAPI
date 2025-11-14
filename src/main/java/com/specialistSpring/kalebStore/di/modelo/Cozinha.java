package com.specialistSpring.kalebStore.di.modelo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Cozinha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(name = "taxa_frete")//definido o nome da coluna no banco de dados
    private BigDecimal taxaFrete;
}
