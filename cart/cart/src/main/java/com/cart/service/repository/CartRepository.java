package com.cart.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cart.service.model.Cart;



public interface CartRepository extends MongoRepository<Cart, String> {


}
