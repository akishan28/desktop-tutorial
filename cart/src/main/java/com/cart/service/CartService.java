package com.cart.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.model.Cart;
import com.cart.repository.CartRepository;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;
    public List<Cart> getCart() {
        return cartRepository.findAll();
    }
     
    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
    }
     
    public Cart updateCart(Cart cart) {
        return cartRepository.save(cart);
    }
    public String getCart(String id) {
        cartRepository.deleteById(id);
        return "Product with id: " + id + " deleted successfully";
    }
    
    
     
}