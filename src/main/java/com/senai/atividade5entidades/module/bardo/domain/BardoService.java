package com.senai.atividade5entidades.module.bardo.domain;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BardoService {

    private final BardoRepository repository;

    public Bardo save (Bardo bardo){
        return repository.save(bardo);
    }

    public List<Bardo> list (){
        return repository.findAll();
    }

    public Bardo findById (Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bardo não encontrado"));
    }

    public Bardo update (Long id, Bardo bardo){
        Bardo bardoSalvo = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bardo não encontrado"));

        bardoSalvo.setNome(bardo.getNome());
        bardoSalvo.setNivel(bardo.getNivel());
        bardoSalvo.setCarisma(bardo.getCarisma());
        bardoSalvo.setInspiracoesRestantes(bardo.getInspiracoesRestantes());
        bardoSalvo.setInstrumento(bardo.getInstrumento());
        bardoSalvo.setColegioBardico(bardo.getColegioBardico());
        bardoSalvo.setMagias(bardo.getMagias());

        return repository.save(bardoSalvo);
    }

    public List<Bardo> findAll(){
        return repository.findAll();
    }

    public void deleteById (Long id){
        repository.deleteById(id);
    }



}
