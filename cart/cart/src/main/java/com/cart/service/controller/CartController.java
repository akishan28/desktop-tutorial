package com.cart.service.controller;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cart.service.model.Cart;
import com.cart.service.service.CartService;




@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;
    @GetMapping("/getcart")
    public ResponseEntity<List<Cart>> getCart() {
        List<Cart> cart = cartService.getCart();
        return new ResponseEntity<>(cart, HttpStatus.OK);
    }
    @PostMapping("/postcart")
    public ResponseEntity<Cart> saveCart(@RequestBody Cart cart) {
        Cart s = cartService.saveCart(cart);
        return new ResponseEntity<>(s, HttpStatus.CREATED);
    }
    @PutMapping("/putcart")
    public ResponseEntity<Cart> updateCart(@RequestBody Cart cart) {
        Cart s = cartService.updateCart(cart);
        return new ResponseEntity<>(s, HttpStatus.CREATED);
    }
    @DeleteMapping("/deletecart/{id}")
    public ResponseEntity<String> deleteCart(@PathVariable String id) {
        String message = cartService.getCart(id);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
