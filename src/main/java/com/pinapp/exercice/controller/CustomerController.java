package com.pinapp.exercice.controller;

import com.pinapp.exercice.dto.CustomerDto;
import com.pinapp.exercice.dto.CustomerKPIDto;
import com.pinapp.exercice.entity.Customer;
import com.pinapp.exercice.service.CustomerKPIService;
import com.pinapp.exercice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerKPIService customerKPIService;

    @PostMapping("/creacliente")
    public Customer create(@RequestBody CustomerDto customer) {
        return customerService.create(customer);
    }

    @GetMapping("/listclientes")
    public List<CustomerDto> list() {
        return customerService.list();
    }

    @GetMapping("/kpideclientes")
    public CustomerKPIDto getKPIs() {
        return customerKPIService.getKPIs();
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
