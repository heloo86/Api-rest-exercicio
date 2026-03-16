package com.senai.atividade5entidades.module.bardo.application.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

public record BardoResponse(
        @Schema(description = "Id indentificador gerado pelo banco de dados.", example = "1")
        Long id,
        @Schema(description = "Nome do bardo.", example = "Fredie")
        String nome,
        @Schema(description = "Nível do personagem, pode ir de 1 a 20.", example = "8")
        int nivel,
        @Schema(description = "Valor de carisma do personagem. Define o bonus para ações que envolvem carisma.", example = "16")
        int carisma,
        @Schema(description = "Quantidade de inspirações para feitiços que o bardo possue no momento.", example = "4")
        int inspiracoesRestantes,
        @Schema(description = "Insrumento que o bardo usa para invocar magia.", example = "Lira")
        String instrumento,
        @Schema(description = "Colégio Bardico que o persongaem segue, é como sua especialização, define o tipo de mágia que ele domina.", example = "Colégio da Eloquência")
        String colegioBardico,
        @Schema(description = "São as mágias que o bardo utiliza.", example = "[\n" +
                "    \"Palavra Curativa\",\n" +
                "    \"Risada Indesejada de Tasha\",\n" +
                "    \"Invisibilidade\",\n" +
                "    \"Sugestão\"\n" +
                "  ]")
        List<String> magias
){
        }
