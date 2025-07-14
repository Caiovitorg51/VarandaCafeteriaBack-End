package com.database.Entities.Interfaces;

import com.database.Entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    // Inclui métodos prontos como findAll(), findById(), save(), deleteById() já estão implementados por JpaRepository
}
