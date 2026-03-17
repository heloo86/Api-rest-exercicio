package com.senai.atividade5entidades.module.barbaro.aplication.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import org.antlr.v4.runtime.misc.NotNull;

public record BarbaroCreateRequest(

        @Schema(description = "Nome do bárbaro.", example = "Bertha", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotBlank
        String nome,

        @Schema(description = "Nível de 1 a 20.", example = "10", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull
        @PositiveOrZero
        @Max(20)
        int nivel,

        @Schema(description = "Valor da constituição (saúde).", example = "18", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull
        @PositiveOrZero
        int constituicao,

        @Schema(description = "Total de pontos de vida.", example = "58", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull
        @PositiveOrZero
        int pontosDeVida,

        @Schema(description = "Coordenação motora e bônus de destreza.", example = "16", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull
        @PositiveOrZero
        int destreza,

        @Schema(description = "Resistência natural (10 + Destreza + Constituição).", example = "16")
        @PositiveOrZero
        int classeArmadura,

        @Schema(description = "Indica se o bárbaro está em fúria.", example = "true")
        boolean estadoFuria,

        @Schema(description = "Usos de fúria restantes até o próximo descanso.", example = "2", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull
        @PositiveOrZero
        int furiaRestante
) {
}
