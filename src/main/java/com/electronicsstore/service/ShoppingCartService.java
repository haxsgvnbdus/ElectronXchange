package com.electronicsstore.service;

import com.electronicsstore.domain.ShoppingCart;

public interface ShoppingCartService {
	
//	ShoppingCart updateShoppingCart(ShoppingCart shoppingCart);
	ShoppingCart updateShoppingCart(ShoppingCart shoppingCart);

	void clearShoppingCart(ShoppingCart shoppingCart);
}
