package com.javawhizz.App.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
    private static final List<CustomerModel> CUSTOMERS = List.of(
            new CustomerModel(1L, "john", "doe", "john@javawhizz.com"),
            new CustomerModel(2L, "mary", "public", "mary@javawhizz.com"),
            new CustomerModel(3L, "elon", "musk","elon@javawhizz.com"),
            new CustomerModel(4L, "dunny","duncan","dunny@javawhizz.com")
    );

    @GetMapping
    public List<CustomerModel> findAllCustomers(){
        return CUSTOMERS;
    }
}
