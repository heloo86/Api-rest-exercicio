package com.senai.atividade5entidades.module.druida.domain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DruidaService {
    private final DruidaRepository repository;

    public Druida save (Druida Druida){
        return repository.save(Druida);
    }

    public List<Druida> list (){
        return repository.findAll();
    }

    public Druida findById (Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Druida não encontrado"));
    }

    public Druida update (Long id, Druida druida){
        Druida druidaSalvo = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Druida não encontrado"));

        druidaSalvo.setNome(druida.getNome());
        druidaSalvo.setNivel(druida.getNivel());
        druidaSalvo.setSabedoria(druida.getSabedoria());
        druidaSalvo.setCargasFormaSelvagem(druida.getCargasFormaSelvagem());
        druidaSalvo.setCirculoDruidico(druida.getCirculoDruidico());

        return repository.save(druidaSalvo);
    }

    public List<Druida> findAll(){
        return repository.findAll();
    }

    public void deleteById (Long id){
        repository.deleteById(id);
    }
}
