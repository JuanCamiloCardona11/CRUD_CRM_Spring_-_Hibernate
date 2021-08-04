package dev.j3c.crm.service;

import dev.j3c.crm.dao.CustomerDAO;
import dev.j3c.crm.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {

   @Autowired
   private CustomerDAO customerDAO;

   @Override
   @Transactional
   public List<Customer> getCustomers() {
      return customerDAO.getCustomers();
   }

   @Override
   public Customer getCustomer(int id) {
      return null;
   }

   @Override
   public void saveCustomer() {

   }

   @Override
   public void deleteCustomer() {

   }
}
