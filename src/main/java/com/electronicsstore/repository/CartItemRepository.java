package com.electronicsstore.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.electronicsstore.domain.CartItem;
import com.electronicsstore.domain.ShoppingCart;

public interface CartItemRepository extends CrudRepository<CartItem, Long> {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
//	List<CartItem> findByOrder(Order order);
}
