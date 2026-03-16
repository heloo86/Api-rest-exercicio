package com.senai.atividade5entidades.module.bardo.application;

import com.senai.atividade5entidades.module.bardo.application.dto.BardoCreateRequest;
import com.senai.atividade5entidades.module.bardo.application.dto.BardoResponse;
import com.senai.atividade5entidades.module.bardo.application.dto.BardoUpdateRequest;
import com.senai.atividade5entidades.module.bardo.domain.Bardo;
import com.senai.atividade5entidades.module.bardo.domain.BardoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Bardo", description = "Operações CRUD do Bardo")
@RestController
@AllArgsConstructor
@RequestMapping("/bardo")
public class BardoController {

    private final BardoMapper mapper;
    private final BardoService service;

    @Operation(
            summary = "Adiciona um novo bardo ao banco de dados",
            description = "Retorna os dados do novo bardo adicionado"
    )
    @PostMapping
    public ResponseEntity<BardoResponse> save (
            @Valid @RequestBody BardoCreateRequest request){
        Bardo bardo = mapper.toEntity(request);
        Bardo bardoSalvo = service.save(bardo);

        return ResponseEntity.ok(mapper.toResponse(bardoSalvo));
    }

    @Operation(
            summary = "Busca por Id um bardo no sistema",
            description = "Retorna os dados do bardo encontrado"
    )
    @GetMapping("/{id}")
    public ResponseEntity<BardoResponse> findById(
            @Parameter(description = "Id a ser buscado", example = "1")
            @PathVariable Long id){
        Bardo bardo = service.findById(id);

        return ResponseEntity.ok(mapper.toResponse(bardo));
    }

    @Operation(
            summary = "Lista todos os bardos do sistema"
    )
    @GetMapping
    public ResponseEntity<List<BardoResponse>> findAll(){
        var litaBardo = service.findAll();
        var response = litaBardo.stream()
                .map(mapper::toResponse)
                .toList();

        return ResponseEntity.ok(response);
    }

    @Operation(
            summary = "Edita os dados de um bardo existente",
            description = "Busca por Id para editar e retorna o bardo atualizado como resposta"
    )
    @PutMapping("/{id}")
    public ResponseEntity<BardoResponse> update (
            @Parameter(description = "Id do bardo a ser editado", example = "1")
            @PathVariable Long id,
            @RequestBody @Valid BardoUpdateRequest request){

        Bardo bardo = mapper.toEntity(request);
        Bardo bardoAtualizado = service.update(id, bardo);

        return ResponseEntity.ok( mapper.toResponse(bardoAtualizado));
    }

    @Operation(
            summary = "Deleta um bardo existente de acordo com o id informado"
    )
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete (
            @Parameter(description = "Id do bardo a ser deletado", example = "1")
            @PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
