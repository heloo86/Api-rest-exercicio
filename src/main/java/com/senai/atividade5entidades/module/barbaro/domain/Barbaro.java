package com.senai.atividade5entidades.module.barbaro.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Schema(description = "Dados do barbaro")
@Entity
@AllArgsConstructor
@Getter
@Setter
@Table(name = "barbaro")
public class Barbaro {

    @Schema(description = "Id gerado pelo banco de dados", example = "1")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Schema(description = "Nome do barbaro", example = "Bertha")
    @Column
    private String nome;

    @Schema(description = "Nível de 1 a 20", example = "10")
    @Column(nullable = false)
    private int nivel;

    @Schema(description = "Valor da constituição do Barbaro, representa a saúde do personagem", example = "18")
    private  int constituicao;

    @Schema(description = "Valor total de pontos de vida do personagem", example = "58")
    private int pontosDeVida;

    @Schema(description = "Valor que representa a coordenação motora do pensonagem e define o bonus para ações que exigem destreza", example = "16")
    private int destreza;

    @Schema(description = "É a resistência natural do personagem semarmadura. è Calculada com base nos modificadores de destreza e constitução + 10", example = "16")
    private int classeArmadura;

    @Schema(description = "Diz se o barbaro esta em estado de furia ou não", example = "true")
    private boolean estadoFuria;

    @Schema(description = "Define quantas vezes o personagem ainda pode entrar em estado de funria durante a partida, ou até o próximo descanso longo", example = "2")
    private int furiaRestante;


    public Barbaro(Long id, String nome,@Max(20) int nivel, int constituicao, int pontosDeVida, int destreza, int classeArmadura, int furiaRestante) {
        this.id = id;
        this.nome = nome;
        this.nivel = nivel;
        this.constituicao = constituicao;
        this.pontosDeVida = pontosDeVida;
        this.destreza = destreza;
        this.classeArmadura = classeArmadura;
        this.estadoFuria = false;
        this.furiaRestante = furiaRestante;
    }


    public Barbaro( String nome, int nivel, int constituicao, int pontosDeVida, int destreza, int classeArmadura, boolean estadoFuria, int furiaRestante) {
        this.nome = nome;
        this.nivel = nivel;
        this.constituicao = constituicao;
        this.pontosDeVida = pontosDeVida;
        this.destreza = destreza;
        this.classeArmadura = classeArmadura;
        this.estadoFuria = estadoFuria;
        this.furiaRestante = furiaRestante;
    }

    public Barbaro(int furiaRestante, boolean estadoFuria, int classeArmadura, int destreza, int pontosDeVida, int constituicao, int nivel, String nome) {
        this.furiaRestante = furiaRestante;
        this.estadoFuria = estadoFuria;
        this.classeArmadura = classeArmadura;
        this.destreza = destreza;
        this.pontosDeVida = pontosDeVida;
        this.constituicao = constituicao;
        this.nivel = nivel;
        this.nome = nome;
    }

    public void setClasseArmadura() {
        this.classeArmadura = this.destreza + this.constituicao;
    }

    public Barbaro() {
    }
}
