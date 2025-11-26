package com.infy.service;

import com.infy.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

    private int count;
    private CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository, int count) {
        this.count = count;
        this.repository = repository;
    }

    @Override
    public String fetchCustomer() {
        return repository.fetchCustomer(count);
    }

    @Override
    public String createCustomer() {
        return repository.createCustomer();
    }
}
