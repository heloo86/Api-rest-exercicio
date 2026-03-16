package com.senai.atividade5entidades.module.barbaro.aplication;

import com.senai.atividade5entidades.module.barbaro.aplication.dto.BarbaroCreateRequest;
import com.senai.atividade5entidades.module.barbaro.aplication.dto.BarbaroResponse;
import com.senai.atividade5entidades.module.barbaro.aplication.dto.BarbaroUpdateRequest;
import com.senai.atividade5entidades.module.barbaro.domain.Barbaro;
import org.springframework.stereotype.Component;

@Component
public class BarbaroMapper {
    public Barbaro toEntity(BarbaroCreateRequest request) {
        Barbaro barbaro = new Barbaro(
                request.nome(),
                request.nivel(),
                request.constituicao(),
                request.pontosDeVida(),
                request.destreza(),
                request.classeArmadura(),
                request.estadoFuria(),
                request.furiaRestante()
        );

        barbaro.setClasseArmadura();
        return barbaro;
    }

    public Barbaro toEntity(BarbaroUpdateRequest request) {
        Barbaro barbaro = new Barbaro(
                request.nome(),
                request.nivel(),
                request.constituicao(),
                request.pontosDeVida(),
                request.classeArmadura(),
                request.destreza(),
                request.estadoFuria(),
                request.furiaRestante()

        );

        barbaro.setClasseArmadura();
        return barbaro;
    }

    public BarbaroResponse toResponse(Barbaro barbaro) {
        return new BarbaroResponse(
                barbaro.getId(),
                barbaro.getNome(),
                barbaro.getNivel(),
                barbaro.getConstituicao(),
                barbaro.getPontosDeVida(),
                barbaro.getDestreza(),
                barbaro.getClasseArmadura(),
                barbaro.isEstadoFuria(),
                barbaro.getFuriaRestante()
        );
    }
}


