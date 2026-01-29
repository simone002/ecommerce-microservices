package com.example.product_service.repository;

import com.example.product_service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// Estendendo JpaRepository otteniamo GRATIS metodi come:
// .save(), .findAll(), .findById(), .delete()
// Non devi scrivere nessuna query SQL!
public interface ProductRepository extends JpaRepository<Product, Long> {
}