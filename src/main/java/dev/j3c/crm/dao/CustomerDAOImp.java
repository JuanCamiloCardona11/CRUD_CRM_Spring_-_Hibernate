package dev.j3c.crm.dao;

import dev.j3c.crm.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImp implements CustomerDAO {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public List<Customer> getCustomers() {
      Session session = sessionFactory.getCurrentSession();
      List<Customer> listCustomers = session.createQuery("from Customer").getResultList();
      return listCustomers;
   }

   @Override
   public Customer getCustomer(int id) {
      return null;
   }

   @Override
   public void saveCustomer(Customer customer) {
      Session session = sessionFactory.getCurrentSession();
      session.save(customer);
   }

   @Override
   public void deleteCustomer(int id) {

   }
}
