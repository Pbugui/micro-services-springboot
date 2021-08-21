package com.dio.shoppingcart.shoppingcart.repository;

import com.dio.shoppingcart.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
