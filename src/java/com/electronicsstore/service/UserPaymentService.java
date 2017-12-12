package com.electronicsstore.service;
 
import com.electronicsstore.domain.UserPayment;

public interface UserPaymentService {
	
	UserPayment findById(Long id);
	void removeById(Long id);
}
