package com.digitalinnovation.experts.productcatalogo.repository;

import com.digitalinnovation.experts.productcatalogo.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {
}
