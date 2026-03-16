package com.senai.atividade5entidades.module.barbaro.domain;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BarbaroService {
    private final BarbaroRepository repository;

    public Barbaro save (Barbaro barbaro){
        return repository.save(barbaro);
    }

    @Transactional
    public Barbaro update (Long id, Barbaro barbaro){
        Barbaro barbaroSalvo = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Barbaro não encontrado"));

        barbaroSalvo.setNome(barbaro.getNome());
        barbaroSalvo.setNivel(barbaro.getNivel());
        barbaroSalvo.setConstituicao(barbaro.getConstituicao());
        barbaroSalvo.setPontosDeVida(barbaro.getPontosDeVida());
        barbaroSalvo.setDestreza(barbaro.getDestreza());
        barbaroSalvo.setClasseArmadura(barbaro.getClasseArmadura());
        barbaroSalvo.setEstadoFuria(barbaro.isEstadoFuria());
        barbaroSalvo.setFuriaRestante(barbaro.getFuriaRestante());

        return barbaroSalvo;

    }

    public Barbaro findById (Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Barbaro não encontrado"));
    }

    public List<Barbaro> findAll(){
        return repository.findAll();
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
