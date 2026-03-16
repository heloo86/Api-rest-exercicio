package com.senai.atividade5entidades.infrastructure.druida;

import com.senai.atividade5entidades.module.druida.domain.Druida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DruidaJpaRepository extends JpaRepository<Druida, Long> {
}
