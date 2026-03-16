package com.senai.atividade5entidades.infrastructure.bardo;

import com.senai.atividade5entidades.module.bardo.domain.Bardo;
import com.senai.atividade5entidades.module.bardo.domain.BardoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class BardoRepositoryAdapter implements BardoRepository {

    private final BardoJpaRepository jpaRepository;

    @Override
    public Bardo save(Bardo bardo) {
        return jpaRepository.save(bardo);
    }

    @Override
    public List<Bardo> findAll() {
        return jpaRepository.findAll();
    }

    @Override
    public Optional<Bardo> findById(Long id) {
        return jpaRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        jpaRepository.deleteById(id);
    }
}
