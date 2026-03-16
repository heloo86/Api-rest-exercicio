package com.senai.atividade5entidades.module.barbaro.aplication.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.PositiveOrZero;
import org.antlr.v4.runtime.misc.NotNull;

public record BarbaroCreateRequest(

        @NotNull
        int constituicao,
        @NotNull
        String nome,
        @NotNull
        @PositiveOrZero
        @Max(20)
        int nivel,
        @NotNull
        @PositiveOrZero
        int pontosDeVida,
        @NotNull
        @PositiveOrZero
        int destreza,
        @PositiveOrZero
        int classeArmadura,
        boolean estadoFuria,
        @NotNull
        @PositiveOrZero
        int furiaRestante
) {
}
