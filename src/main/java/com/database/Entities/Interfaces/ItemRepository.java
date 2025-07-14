package com.database.Entities.Interfaces;

import com.database.Entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer>{
    // Inclui métodos prontos como findAll(), findById(), save(), deleteById() já estão implementados por JpaRepository
}
