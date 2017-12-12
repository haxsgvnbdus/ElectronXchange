package com.electronicsstore.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronicsstore.domain.Product;
import com.electronicsstore.repository.ProductRepository;
import com.electronicsstore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired 
	private ProductRepository productRepository; 
	
	public List<Product> findAll(){
		List<Product> productList = (List<Product>) productRepository.findAll();
		
		List<Product> activeProductList = new ArrayList<>();
		
		for (Product product: productList) {
			if (product.isActive()) {
				activeProductList.add(product);
			}
		}
		
		return activeProductList;
	}
	
	public Product findOne(Long id) {
		return productRepository.findOne(id);
	}
	
	public Product save(Product product) {
		return productRepository.save(product);
	}
	
	public List<Product> blurrySearch(String title) {
		List<Product> productList = productRepository.findByTitleContaining(title);
		
		List<Product> activeProductList = new ArrayList<>();
		
		for (Product product: productList) {
			if (product.isActive()) {
				activeProductList.add(product);
			}
		}
		
		return activeProductList;
	}
	
	public void removeOne(Long id) {
		productRepository.delete(id);
	}
	
}	
