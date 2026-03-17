package com.senai.atividade5entidades.module.druida.application.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public record DruidaResponse(
        @Schema(description = "ID único gerado pelo banco de dados.", example = "1")
        Long id,

        @Schema(description = "Nome do druida.", example = "Keyleth")
        String nome,

        @Schema(description = "Nível do personagem (1 a 20).", example = "12")
        int nivel,

        @Schema(description = "Atributo de Sabedoria, essencial para magias de Druida.", example = "20")
        int sabedoria,

        @Schema(description = "Número de utilizações da Forma Selvagem disponíveis.", example = "2")
        int cargasFormaSelvagem,

        @Schema(description = "Subclasse que define a conexão do druida com a natureza.", example = "Círculo da Lua")
        String circuloDruidico
) {
}
