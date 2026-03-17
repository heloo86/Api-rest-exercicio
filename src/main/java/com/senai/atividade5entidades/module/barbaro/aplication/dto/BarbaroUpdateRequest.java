package com.senai.atividade5entidades.module.barbaro.aplication.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.PositiveOrZero;

public record BarbaroUpdateRequest(
        @Schema(description = "Novo nome do bárbaro.", example = "Bertha, a Destruidora")
        String nome,

        @Schema(description = "Novo nível (máximo 20).", example = "11")
        @Max(20)
        @PositiveOrZero
        int nivel,

        @Schema(description = "Atualização da constituição.", example = "20")
        @PositiveOrZero
        int constituicao,

        @Schema(description = "Atualização dos pontos de vida.", example = "65")
        @PositiveOrZero
        int pontosDeVida,

        @Schema(description = "Atualização da destreza.", example = "14")
        @PositiveOrZero
        int destreza,

        @Schema(description = "Nova classe de armadura.", example = "18")
        @PositiveOrZero
        int classeArmadura,

        @Schema(description = "Alterar estado de fúria.", example = "false")
        boolean estadoFuria,

        @Schema(description = "Atualizar fúrias restantes.", example = "1")
        @PositiveOrZero
        int furiaRestante
) {
}
