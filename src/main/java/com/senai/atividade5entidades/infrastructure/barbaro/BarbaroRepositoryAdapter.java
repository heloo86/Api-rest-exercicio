package com.senai.atividade5entidades.infrastructure.barbaro;

import com.senai.atividade5entidades.module.barbaro.domain.Barbaro;
import com.senai.atividade5entidades.module.barbaro.domain.BarbaroRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BarbaroRepositoryAdapter implements BarbaroRepository {

    private final BabaroJpaRepository jpaRepository;

    public BarbaroRepositoryAdapter(BabaroJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Barbaro save(Barbaro barbaro) {
        return jpaRepository.save(barbaro);
    }

    @Override
    public List<Barbaro> findAll() {
        return jpaRepository.findAll();
    }

    @Override
    public Optional<Barbaro> findById(Long id) {
        return jpaRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        jpaRepository.deleteById(id);
    }



}
