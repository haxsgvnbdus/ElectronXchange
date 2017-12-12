package com.electronicsstore.repository;

 
import org.springframework.data.repository.CrudRepository;

import com.electronicsstore.domain.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long>{

}