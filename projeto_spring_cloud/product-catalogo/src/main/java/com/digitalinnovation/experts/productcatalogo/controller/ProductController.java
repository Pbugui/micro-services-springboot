package com.digitalinnovation.experts.productcatalogo.controller;

import com.digitalinnovation.experts.productcatalogo.model.Product;
import com.digitalinnovation.experts.productcatalogo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    Product create(@RequestBody Product product) {

        return productRepository.save(product);
    }

    @GetMapping("/{id}")
    Optional<Product> findById(@PathVariable("id") Integer id) {

        return productRepository.findById(id);

    }
}
