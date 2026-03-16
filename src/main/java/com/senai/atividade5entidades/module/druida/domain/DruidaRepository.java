package com.senai.atividade5entidades.module.druida.domain;

import java.util.List;
import java.util.Optional;

public interface DruidaRepository {
    Druida save(Druida druida);
    Optional<Druida> findById(Long id);
    List<Druida>findAll();
    void deleteById(Long id);
}
