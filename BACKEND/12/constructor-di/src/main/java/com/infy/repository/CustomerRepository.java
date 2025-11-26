package com.infy.repository;

public class CustomerRepository {

    public String fetchCustomer(int count) {
        return "The number of Customer fetched are : " + count;
    }

    public String createCustomer() {
        return "Customer is successfully created";
    }
}
