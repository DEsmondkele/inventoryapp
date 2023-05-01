package com.inventoryapp.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
public record CustomerController(CustomerService customerService){
 public void createCustomer(@RequestBody CustomerRegistrationRequest registrationRequest){

     log.info("new customer register{}",registrationRequest);
     customerService.registerCustomer(registrationRequest);
 }
}
