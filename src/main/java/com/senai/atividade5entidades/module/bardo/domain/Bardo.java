package com.senai.atividade5entidades.module.bardo.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Schema(description = "Dados do bardo")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "bardo")
public class Bardo {

    @Schema(description = "Id gerado pelo banco de dados", example = "1")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Schema(description = "Nome do bardo", example = "Fredie")
    @Column(nullable = false)
    private String nome;

    @Schema(description = "Nível de 1 a 20", example = "8")
    private int nivel;

    @Schema(description = "Valor de carisma do personagem. Define o bonus para ações que envolvem carisma", example = "16")
    private int carisma;

    @Schema(description = "Quantidade de inspirações para feitiços que o bardo possue no momento", example = "4")
    private int inspiracoesRestantes;

    @Schema(description = "Insrumento que o bardo usa para invocar magia", example = "Lira")
    private String instrumento;

    @Schema(description = "Colégio Bardico que o persongaem segue, é como sua especialização, define o tipo de mágia que ele domina", example = "Colégio da Eloquência")
    private String colegioBardico;

    @Schema(description = "São as mágias que o bardo utiliza", example = "[\n" +
            "    \"Palavra Curativa\",\n" +
            "    \"Risada Indesejada de Tasha\",\n" +
            "    \"Invisibilidade\",\n" +
            "    \"Sugestão\"\n" +
            "  ]")
    @ElementCollection
    private List<String> magias;

    public Bardo(String nome, int nivel, int carisma, int inspiracoesRestantes, String instrumento, String colegioBardico, List<String> magias) {
        this.nome = nome;
        this.nivel = nivel;
        this.carisma = carisma;
        this.inspiracoesRestantes = inspiracoesRestantes;
        this.instrumento = instrumento;
        this.colegioBardico = colegioBardico;
        this.magias = magias;
    }
}
