package com.electronicsstore.repository;


import org.springframework.data.repository.CrudRepository;

import com.electronicsstore.domain.UserPayment;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long> {

}
