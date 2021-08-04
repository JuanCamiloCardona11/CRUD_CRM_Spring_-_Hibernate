package dev.j3c.crm.controller;

import dev.j3c.crm.entity.Customer;
import dev.j3c.crm.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
