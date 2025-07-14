package com.database.Entities.Interfaces;

import com.database.Entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    // Inclui métodos prontos como findAll(), findById(), save(), deleteById() já estão implementados por JpaRepository

}

