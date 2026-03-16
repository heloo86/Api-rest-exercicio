package com.senai.atividade5entidades.module.barbaro.aplication.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public record BarbaroResponse(
        @Schema(description = "Id de indentificação gerado pelo banco de dados.", example = "1")
        Long id,
        @Schema(description = "Nome do barbaro.", example = "Bertha")
        String nome,
        @Schema(description = "Nível de 1 a 20", example = "10")
        int nivel,
        @Schema(description = "Valor da constituição do Barbaro, representa a saúde do personagem.", example = "18")
        int constituicao,
        @Schema(description = "Valor total de pontos de vida do personagem.", example = "58")
        int pontosDeVida,
        @Schema(description = "Valor que representa a coordenação motora do pensonagem e define o bonus para ações que exigem destreza.", example = "16")
        int destreza,
        @Schema(description = "É a resistência natural do personagem semarmadura. è Calculada com base nos modificadores de destreza e constitução + 10.", example = "16")
        int classeArmadura,
        @Schema(description = "Diz se o barbaro esta em estado de furia ou não.", example = "true")
        boolean estadoFuria,
        @Schema(description = "Define quantas vezes o personagem ainda pode entrar em estado de funria durante a partida, ou até o próximo descanso longo.", example = "2")
        int furiaRestante
) {
}
