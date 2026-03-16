package com.senai.atividade5entidades.infrastructure.barbaro;

import com.senai.atividade5entidades.module.barbaro.domain.Barbaro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BabaroJpaRepository extends JpaRepository<Barbaro, Long> {
}
