package com.senai.atividade5entidades.module.bardo.application.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.PositiveOrZero;

import java.util.List;

public record BardoUpdateRequest(
        @Schema(description = "Novo nome do bardo.", example = "Fredie Mercury")
        String nome,

        @Schema(description = "Novo nível (máximo 20).", example = "9")
        @Max(20)
        int nivel,

        @Schema(description = "Novo valor de carisma.", example = "18")
        @PositiveOrZero
        int carisma,

        @Schema(description = "Atualização de inspirações.", example = "5")
        @PositiveOrZero
        int inspiracoesRestantes,

        @Schema(description = "Novo instrumento.", example = "Alaúde")
        String instrumento,

        @Schema(description = "Mudança de colégio (se permitido).", example = "Colégio do Saber")
        String colegioBardico,

        @Schema(description = "Nova lista completa de magias.", example = "[\"Palavra Curativa\"]")
        List<String> magias
) {
}
