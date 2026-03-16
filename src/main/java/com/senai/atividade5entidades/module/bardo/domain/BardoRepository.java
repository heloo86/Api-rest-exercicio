package com.senai.atividade5entidades.module.bardo.domain;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BardoRepository {
    Bardo save(Bardo bardo);
    List<Bardo> findAll();
    Optional<Bardo> findById(Long Id);
    void deleteById(Long id);
}
