package com.senai.atividade5entidades.module.bardo.application.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.util.List;

public record BardoCreateRequest(
        @NotNull
        String nome,
        @PositiveOrZero
        @Max(20)
        int nivel,
        @PositiveOrZero
        int carisma,
        @PositiveOrZero
        int inspiracoesRestantes,
        @PositiveOrZero
        String instrumento,
        @PositiveOrZero
        String colegioBardico,
        List<String> magias
) {
}
