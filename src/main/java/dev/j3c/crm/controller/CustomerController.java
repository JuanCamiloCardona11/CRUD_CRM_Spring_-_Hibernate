package dev.j3c.crm.controller;

import dev.j3c.crm.entity.Customer;
import dev.j3c.crm.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

   @Autowired
   private CustomerService customerService;

   @GetMapping("/list")
   private String getCustomers(Model model) {
      List<Customer> customersList = customerService.getCustomers();
      model.addAttribute("customersList", customersList);
      return("list-customers");
   }

   @GetMapping("/form-add-customer")
   public String showFormAddCustomer(Model model) {
      Customer customer = new Customer();
      model.addAttribute("newCustomer", customer);
      return("form-customer");
   }

   @PostMapping("/save-customer")
   public String saveCustomer(@ModelAttribute("newCustomer") Customer customer) {
      this.customerService.saveCustomer(customer);
      return "redirect:/customer/list";
   }

   @GetMapping("/show-form-update")
   public String showFormUpdateCustomer(@RequestParam("customerId") int customerId, Model model) {
      Customer customer = this.customerService.getCustomer(customerId);
      model.addAttribute("customer", customer);
      return("form-customer");
   }

   @GetMapping("/delete-customer")
   public String deleteCustomer(@RequestParam("customerId") int customerId) {
      this.customerService.deleteCustomer(customerId);
      return("redirect:/customer/list");
   }



}
