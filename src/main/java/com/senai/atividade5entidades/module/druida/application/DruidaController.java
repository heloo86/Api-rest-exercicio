package com.senai.atividade5entidades.module.druida.application;

import com.senai.atividade5entidades.module.druida.application.dto.DruidaRequest;
import com.senai.atividade5entidades.module.druida.application.dto.DruidaResponse;
import com.senai.atividade5entidades.module.druida.domain.Druida;
import com.senai.atividade5entidades.module.druida.domain.DruidaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Druida", description = "Operações CRUD do Druida")
@RestController
@AllArgsConstructor
@RequestMapping("/druida")
public class DruidaController {

    private final DruidaMapper mapper;
    private final DruidaService service;

    @Operation(
            summary = "Adiciona um novo druida ao banco de dados",
            description = "Retorna os dados do novo druida adicionado"
    )
    @PostMapping
    public ResponseEntity<DruidaResponse> save (
            @Valid @RequestBody DruidaRequest request){
        Druida druida = mapper.toEntity(request);
        Druida druidaSalvo = service.save(druida);

        return ResponseEntity.ok(mapper.toResponse(druidaSalvo));
    }

    @Operation(
            summary = "Busca por Id um druida no sistema",
            description = "Retorna os dados do druida encontrado"
    )
    @GetMapping("/{id}")
    public ResponseEntity<DruidaResponse> findById(
            @Parameter(description = "Id a ser buscado", example = "1")
            @PathVariable Long id){
        Druida druida = service.findById(id);

        return ResponseEntity.ok(mapper.toResponse(druida));
    }

    @Operation(
            summary = "Lista todos os druidas do sistema"
    )
    @GetMapping
    public ResponseEntity<List<DruidaResponse>> findAll(){
        var litaDruida = service.findAll();
        var response = litaDruida.stream()
                .map(mapper::toResponse)
                .toList();

        return ResponseEntity.ok(response);
    }

    @Operation(
            summary = "Edita os dados de um druida existente",
            description = "Busca por Id para editar e retorna o druida atualizado como resposta"
    )
    @PutMapping("/{id}")
    public ResponseEntity<DruidaResponse> update (
            @Parameter(description = "Id do druida a ser editado", example = "1")
            @PathVariable Long id,
            @RequestBody @Valid DruidaRequest request){

        Druida druida = mapper.toEntity(request);
        Druida druidaAtualizado = service.update(id, druida);

        return ResponseEntity.ok( mapper.toResponse(druidaAtualizado));
    }

    @Operation(
            summary = "Deleta um druida existente de acordo com o id informado"
    )
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete (
            @Parameter(description = "Id do druida a ser deletado", example = "1")
            @PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
