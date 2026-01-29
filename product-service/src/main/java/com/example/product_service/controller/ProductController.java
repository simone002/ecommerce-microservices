package com.example.product_service.controller;

import com.example.product_service.model.Product;
import com.example.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController                // Dice che questa classe gestisce richieste REST (JSON)
@RequestMapping("/api/product") // Tutte le chiamate inizieranno con questo URL
@RequiredArgsConstructor       // Inietta automaticamente il Repository (costruttore)
public class ProductController {

    private final ProductRepository productRepository;

    // Quando qualcuno fa una POST su /api/product -> Crea il prodotto
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    // Quando qualcuno fa una GET su /api/product -> Restituisce la lista
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}