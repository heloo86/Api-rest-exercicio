package com.senai.atividade5entidades.module.druida.application;

import com.senai.atividade5entidades.module.druida.application.dto.DruidaRequest;
import com.senai.atividade5entidades.module.druida.application.dto.DruidaResponse;
import com.senai.atividade5entidades.module.druida.domain.Druida;
import jakarta.validation.Valid;
import org.springframework.stereotype.Component;

@Component
public class DruidaMapper {
    public Druida toEntity(@Valid DruidaRequest request) {
        return new Druida(
                request.nome(),
                request.nivel(),
                request.sabedoria(),
                request.cargasFormaSelvagem(),
                request.circuloDruidico()
        );
    }

    public DruidaResponse toResponse(Druida druida) {
        return new DruidaResponse(
                druida.getId(),
                druida.getNome(),
                druida.getNivel(),
                druida.getSabedoria(),
                druida.getCargasFormaSelvagem(),
                druida.getCirculoDruidico()
        );
    }
}
