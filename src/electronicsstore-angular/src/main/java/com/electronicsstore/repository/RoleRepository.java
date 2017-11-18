package com.electronicsstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.electronicsstore.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{
	
}
