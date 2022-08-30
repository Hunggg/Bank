package com.bank.service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entity.Customer;
import com.bank.repository.CustomerRepository;
import com.bank.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomer() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        Customer data = new Customer();
        data.setId(getLastid() + 1);
        data.setFirstName(customer.getFirstName());
        data.setLastName(customer.getLastName());
        data.setDateOfBirth(customer.getDateOfBirth());
        data.setGender(customer.getGender());
        return customerRepository.save(data);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);

    }

    @Override
    public Long getLastid() {
        return customerRepository.findLastCustomerId();
    }

}
