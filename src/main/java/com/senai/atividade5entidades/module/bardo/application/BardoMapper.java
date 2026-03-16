package com.senai.atividade5entidades.module.bardo.application;

import com.senai.atividade5entidades.module.bardo.application.dto.BardoCreateRequest;
import com.senai.atividade5entidades.module.bardo.application.dto.BardoResponse;
import com.senai.atividade5entidades.module.bardo.application.dto.BardoUpdateRequest;
import com.senai.atividade5entidades.module.bardo.domain.Bardo;
import jakarta.validation.Valid;
import org.springframework.stereotype.Component;

@Component
public class BardoMapper {
    public Bardo toEntity(@Valid BardoCreateRequest request) {
        return new Bardo(
                request.nome(),
                request.nivel(),
                request.carisma(),
                request.inspiracoesRestantes(),
                request.instrumento(),
                request.colegioBardico(),
                request.magias()
        );
    }

    public Bardo toEntity(@Valid BardoUpdateRequest request) {
        return new Bardo(
                request.nome(),
                request.nivel(),
                request.carisma(),
                request.inspiracoesRestantes(),
                request.instrumento(),
                request.colegioBardico(),
                request.magias()
        );
    }

    public BardoResponse toResponse(Bardo bardo) {

        return new BardoResponse(
                bardo.getId(),
                bardo.getNome(),
                bardo.getNivel(),
                bardo.getCarisma(),
                bardo.getInspiracoesRestantes(),
                bardo.getInstrumento(),
                bardo.getColegioBardico(),
                bardo.getMagias()
        );
    }
}
