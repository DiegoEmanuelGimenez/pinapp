package com.pinapp.exercice.service;

import com.pinapp.exercice.dto.CustomerDto;
import com.pinapp.exercice.entity.Customer;

import java.util.List;

public interface CustomerService {

    Customer create(CustomerDto customer);

    List<CustomerDto> list();

    Customer getById(Long id);

}
