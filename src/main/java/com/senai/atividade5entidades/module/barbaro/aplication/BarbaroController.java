package com.senai.atividade5entidades.module.barbaro.aplication;

import com.senai.atividade5entidades.module.barbaro.aplication.dto.BarbaroCreateRequest;
import com.senai.atividade5entidades.module.barbaro.aplication.dto.BarbaroResponse;
import com.senai.atividade5entidades.module.barbaro.aplication.dto.BarbaroUpdateRequest;
import com.senai.atividade5entidades.module.barbaro.domain.Barbaro;
import com.senai.atividade5entidades.module.barbaro.domain.BarbaroService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/barbaro")
public class BarbaroController {

    private final BarbaroService service;
    private final BarbaroMapper mapper;

    @Operation(
            summary = "Adiciona um novo barbaro ao banco de dados",
            description = "Retorna os dados do novo barbaro adicionado"
    )
    @PostMapping
    public ResponseEntity<BarbaroResponse> save (
            @Valid @RequestBody BarbaroCreateRequest request){
        Barbaro barbaro = mapper.toEntity(request);
        Barbaro barbaroSalvo = service.save(barbaro);

        return ResponseEntity.ok(mapper.toResponse(barbaroSalvo));
    }

    @Operation(
            summary = "Busca por Id um barbaro no sistema",
            description = "Retorna os dados do barbaro encontrado"
    )
    @GetMapping("/{id}")
    public ResponseEntity<BarbaroResponse> findById(@PathVariable Long id){
        Barbaro barbaro = service.findById(id);

        return ResponseEntity.ok(mapper.toResponse(barbaro));
    }

    @Operation(
            summary = "Lista todos os barbaros do sistema"
    )
    @GetMapping
    public ResponseEntity<List<BarbaroResponse>> findAll(){
        var litaBarbaro = service.findAll();
        var response = litaBarbaro.stream()
                .map(mapper::toResponse)
                .toList();

        return ResponseEntity.ok(response);
    }

    @Operation(
            summary = "Edita os dados de um barbaro existente",
            description = "Busca por Id para editar e retorna o barbaro atualizado como resposta"
    )
    @PutMapping("/{id}")
    public ResponseEntity<BarbaroResponse> update (
            @Parameter(description = "Id do barbaro a ser editado", example = "1")
            @PathVariable Long id,
            @RequestBody @Valid BarbaroUpdateRequest request){

        Barbaro barbaro = mapper.toEntity(request);
        Barbaro barbaroAtualizado = service.update(id, barbaro);

        return ResponseEntity.ok( mapper.toResponse(barbaroAtualizado));
    }

    @Operation(
            summary = "Deleta um barbaro existente de acordo com o id informado"
    )
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete (
            @Parameter(description = "Id do barbaro a ser deletado", example = "1")
            @PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
