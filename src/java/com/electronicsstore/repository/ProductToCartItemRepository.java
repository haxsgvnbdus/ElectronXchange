package com.electronicsstore.repository;
 
import org.springframework.data.repository.CrudRepository;

import com.electronicsstore.domain.ProductToCartItem;
import com.electronicsstore.domain.CartItem;

public interface ProductToCartItemRepository extends CrudRepository<ProductToCartItem, Long>{
	void deleteByCartItem(CartItem cartItem);
}
