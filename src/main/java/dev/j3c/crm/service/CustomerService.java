package dev.j3c.crm.service;

import dev.j3c.crm.entity.Customer;

import java.util.List;

public interface CustomerService {

   public List<Customer> getCustomers();

   public Customer getCustomer(int id);

   public void saveCustomer();

   public void deleteCustomer();

}
