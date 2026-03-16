package com.senai.atividade5entidades.infrastructure.bardo;

import com.senai.atividade5entidades.module.bardo.domain.Bardo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BardoJpaRepository extends JpaRepository<Bardo,Long > {
}
