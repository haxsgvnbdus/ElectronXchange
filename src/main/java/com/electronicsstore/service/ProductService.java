package com.electronicsstore.service;

import java.util.List;

 
import com.electronicsstore.domain.Product;

 
public interface ProductService {
	
	List<Product> findAll();
	Product findOne(Long id);
	Product save(Product product);
//	List<Product> blurrySearch(String title);
	void removeOne(Long id);
	
}
