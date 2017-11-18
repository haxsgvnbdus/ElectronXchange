package com.electronicsstore.service;

import java.util.Set;

import com.electronicsstore.domain.User;
import com.electronicsstore.domain.security.UserRole;

public interface UserService {
	
	User createUser(User user, Set<UserRole> userRoles);
	
	
}
