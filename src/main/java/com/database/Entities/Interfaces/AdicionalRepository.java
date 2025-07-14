package com.database.Entities.Interfaces;

import com.database.Entities.Adicional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdicionalRepository extends JpaRepository<Adicional, Integer>{
    // Inclui métodos prontos como findAll(), findById(), save(), deleteById() já estão implementados por JpaRepository
}