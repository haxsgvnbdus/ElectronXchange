package com.electronicsstore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.electronicsstore.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
	
	List<Product> findByTitleContaining(String keyword);
	
}
