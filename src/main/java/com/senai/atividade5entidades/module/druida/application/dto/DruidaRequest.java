package com.senai.atividade5entidades.module.druida.application.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

public record DruidaRequest(
        @Schema(description = "Nome do druida.", example = "Marta", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotBlank
        String nome,

        @Schema(description = "Nível de 1 a 20.", example = "12", requiredMode = Schema.RequiredMode.REQUIRED)
        @PositiveOrZero
        @Max(20)
        int nivel,

        @Schema(description = "Valor de Sabedoria que definira o bonus em feitiços de sabedoria.", example = "20", requiredMode = Schema.RequiredMode.REQUIRED)
        @PositiveOrZero
        int sabedoria,

        @Schema(description = "Quantidade de cargas de Forma Selvagem por partida.", example = "2")
        @PositiveOrZero
        int cargasFormaSelvagem,

        @Schema(description = "Círculo Druídico do personagem.  É como sua especialização e influencia o tipo de magia que ele" +
                " domina.", example = "Círculo da Terra")
        @NotBlank
        String circuloDruidico
) {
}
