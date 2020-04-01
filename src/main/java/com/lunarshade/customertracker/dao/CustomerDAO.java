package com.lunarshade.customertracker.dao;

import com.lunarshade.customertracker.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> getCustomers();
    Customer getCustomer(int id);
    void saveCustomer(Customer customer);
    void deleteCustomer(int id);
    List<Customer> searchCustomers(String theSearchName);
}
