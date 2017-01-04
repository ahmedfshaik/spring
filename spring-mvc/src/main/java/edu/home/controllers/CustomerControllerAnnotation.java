package edu.home.controllers;

import java.util.Map;

import javax.naming.Binding;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.home.domains.Customer;

@Controller
@RequestMapping("/customers")
public class CustomerControllerAnnotation {
    
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @RequestMapping(method=RequestMethod.GET, params="new")
    public String createCustomerProfile(Map<String, Object> m){
      m.put("customer", new Customer());
      return "NewCustomer";
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public String insertCustomer(@Valid Customer customer, BindingResult bindingResult) throws Exception {
      if(bindingResult.hasErrors()){ //In case of validation errors
        return "NewCustomer"; //redirected back to request page
      }

      Integer cid = (Integer)hibernateTemplate.save(customer);
      customer.setCid(cid);
      
      return "success";
    }

}
