package com.example.inventory_service.repository;

import com.example.inventory_service.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
  // Spring crea automaticamente la query SQL per cercare per skuCode
  Optional<Inventory> findBySkuCode(String skuCode);
}