package com.bank.service;

import java.util.List;

import com.bank.entity.Customer;

public interface CustomerService {
    List<Customer> getAllCustomer();
    Customer saveCustomer(Customer customer);
    void deleteCustomer(Long id);
    Long getLastid();
}
