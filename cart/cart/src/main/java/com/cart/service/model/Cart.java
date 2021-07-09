package com.cart.service.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="cart")
public class Cart {
	
	
	@Id
	 private String productName;
	 private long productPrice;
	 private long productQuantity;
	 
	 
	 public Cart() {
		 
	 }
	 
	 
	public Cart(String productName, long productPrice, long productQuantity) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}
	public long getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(long productQuantity) {
		this.productQuantity = productQuantity;
	}
	@Override
	public String toString() {
		return "Cart [productName=" + productName + ", productPrice=" + productPrice + ", productQuantity=" + productQuantity + "]";
	}
	 
	 
}