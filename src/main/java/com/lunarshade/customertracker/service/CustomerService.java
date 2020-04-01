package com.lunarshade.customertracker.service;

import com.lunarshade.customertracker.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomers();
    Customer getCustomer(int id);
    public void saveCustomer(Customer customer);
    void deleteCustomer(int id);
    List<Customer> searchCustomers(String theSearchName);
}
