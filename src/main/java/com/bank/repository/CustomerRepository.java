package com.bank.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{
    @Query(value = "SELECT MAX(id) FROM customer", nativeQuery = true)
    Long findLastCustomerId();
}
