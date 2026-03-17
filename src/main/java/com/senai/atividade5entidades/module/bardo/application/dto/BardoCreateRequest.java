package com.senai.atividade5entidades.module.bardo.application.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.util.List;

public record BardoCreateRequest(
        @Schema(description = "Nome do bardo.", example = "Fredie", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotBlank
        String nome,

        @Schema(description = "Nível do personagem (1 a 20).", example = "8", requiredMode = Schema.RequiredMode.REQUIRED)
        @PositiveOrZero
        @Max(20)
        int nivel,

        @Schema(description = "Valor de carisma.", example = "16", requiredMode = Schema.RequiredMode.REQUIRED)
        @PositiveOrZero
        int carisma,

        @Schema(description = "Quantidade de inspirações atuais.", example = "4")
        @PositiveOrZero
        int inspiracoesRestantes,

        @Schema(description = "Instrumento musical focado.", example = "Lira")
        String instrumento,

        @Schema(description = "Especialização do bardo.", example = "Colégio da Eloquência")
        String colegioBardico,

        @Schema(description = "Lista de magias conhecidas.", example = "[\"Invisibilidade\", \"Sugestão\"]")
        List<String> magias
) {
}
