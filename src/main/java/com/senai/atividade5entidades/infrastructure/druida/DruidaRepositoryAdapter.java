package com.senai.atividade5entidades.infrastructure.druida;

import com.senai.atividade5entidades.module.druida.domain.Druida;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class DruidaRepositoryAdapter {

    private final DruidaJpaRepository jpaRepository;

    public Druida save (Druida druida){
        return jpaRepository.save(druida);
    }

    public List<Druida> findAll (){
        return jpaRepository.findAll();
    }

    public Optional<Druida> findById (long id){
        return jpaRepository.findById(id);
    }

    public void deleteById (long id){
        jpaRepository.deleteById(id);
    }

}
