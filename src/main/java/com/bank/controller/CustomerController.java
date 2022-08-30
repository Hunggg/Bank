package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.Customer;
import com.bank.service.ServiceImpl.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired private CustomerServiceImpl customerServiceImpl;

    @GetMapping
    public List<Customer> getAllCustomer() {
        return customerServiceImpl.getAllCustomer();
    }

    @PostMapping("save")
    public Customer saveBranch(@RequestBody Customer customer) {
        return customerServiceImpl.saveCustomer(customer);
    }
}
