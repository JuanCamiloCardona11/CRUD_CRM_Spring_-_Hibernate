package dev.j3c.crm.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name="customer")
public class Customer {

   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
   @Column(name="id")
   private int id;

   @Column(name="first_name")
   private String firstName;

   @Column(name="last_name")
   private String lastName;

   @Column(name="age")
   private int age;

   @Column(name="email")
   private String email;

   public Customer() {
   }

   public Customer(int id) {
      this.id = id;
   }

   public Customer(String firstName, String lastName, int age, String email) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.email = email;
   }

   public Customer(int id, String firstName, String lastName, int age, String email) {
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.email = email;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getFirstName() {
      return this.firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return this.lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public int getAge() {
      return this.age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getEmail() {
      return this.email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   @Override
   public String toString() {
      return "Customer [" +
              "id=" + this.id +
              ", firstName='" + this.firstName +
              ", lastName='" + this.lastName +
              ", age=" + this.age +
              ", email='" + this.email +
              ']';
   }
}
