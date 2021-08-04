package dev.j3c.crm.dao;

import dev.j3c.crm.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImp implements CustomerDAO {

   @Override
   public List<Customer> getCustomers() {
      return null;
   }

   @Override
   public Customer getCustomer(int id) {
      return null;
   }

   @Override
   public void saveCustomer(Customer customer) {

   }

   @Override
   public void deleteCustomer(int id) {

   }
}
