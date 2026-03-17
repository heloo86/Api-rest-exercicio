package com.senai.atividade5entidades.module.druida.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Druida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    private int nivel;

    private int sabedoria;

    private int cargasFormaSelvagem;

    private String circuloDruidico;


    public Druida(String nome, int nivel, int sabedoria, int cargasFormaSelvagem, String circuloDruidico) {
        this.nome = nome;
        this.nivel = nivel;
        this.sabedoria = sabedoria;
        this.cargasFormaSelvagem = cargasFormaSelvagem;
        this.circuloDruidico = circuloDruidico;
    }
}
