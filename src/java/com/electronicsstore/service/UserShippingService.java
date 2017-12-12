package com.electronicsstore.service;


import com.electronicsstore.domain.UserShipping;

public interface UserShippingService {
	
	UserShipping findById(Long id);
	
	void removeById(Long id);

}
