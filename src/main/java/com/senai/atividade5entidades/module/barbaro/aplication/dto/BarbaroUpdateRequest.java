package com.senai.atividade5entidades.module.barbaro.aplication.dto;

import jakarta.validation.constraints.Max;

public record BarbaroUpdateRequest(
        String nome,
        @Max(20)
        int nivel,
        int constituicao,
        int pontosDeVida,
        int destreza,
        int classeArmadura,
        boolean estadoFuria,
        int furiaRestante
) {
}
