package com.electronicsstore.repository;

 
import org.springframework.data.repository.CrudRepository;

import com.electronicsstore.domain.UserBilling;

public interface UserBillingRepository extends CrudRepository<UserBilling, Long> {

}
