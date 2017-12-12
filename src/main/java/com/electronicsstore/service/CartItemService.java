package com.electronicsstore.service;

import java.util.List;

import com.electronicsstore.domain.CartItem;
import com.electronicsstore.domain.Product;
import com.electronicsstore.domain.ShoppingCart;
import com.electronicsstore.domain.User;

public interface CartItemService {
	
	CartItem addProductToCartItem(Product product, User user, int qty);
	
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
//	List<CartItem> findByOrder(Order order);
	
	CartItem updateCartItem(CartItem cartItem);
	
	void removeCartItem(CartItem cartItem);
	
	CartItem findById(Long id);
	
	CartItem save(CartItem cartItem);
}
