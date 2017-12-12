package com.electronicsstore.service;

import java.util.Set;

import com.electronicsstore.domain.User;
import com.electronicsstore.domain.UserBilling;
import com.electronicsstore.domain.UserPayment;
import com.electronicsstore.domain.UserShipping;
import com.electronicsstore.domain.security.UserRole;

public interface UserService {
	
	User createUser(User user, Set<UserRole> userRoles);
	
	User findByUsername(String username);
	
	User findByEmail (String email);
	
	User save(User user);
	
	User findById(Long id);

	void updateUserPaymentInfo(UserBilling userBilling, UserPayment userPayment, User user);
	
	void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);
	
	void setUserDefaultPayment(Long userPaymentId, User user);

	void updateUserShipping(UserShipping userShipping, User user);
	
	void setUserDefaultShipping(Long userShippingId, User user);
	
}
