package com.senai.atividade5entidades.module.barbaro.domain;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BarbaroRepository {
    public Barbaro save(Barbaro barbaro);
    public List<Barbaro> findAll();
    public Optional<Barbaro> findById(Long Id);
    public void deleteById(Long id);
}
