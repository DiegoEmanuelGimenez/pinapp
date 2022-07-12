package com.pinapp.exercice.service;

import com.pinapp.exercice.dto.CustomerDto;
import com.pinapp.exercice.dto.converter.CustomerConverter;
import com.pinapp.exercice.entity.Customer;
import com.pinapp.exercice.exception.BadRequestException;
import com.pinapp.exercice.repository.CustomerRepository;
import com.pinapp.exercice.validator.CustomerValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerConverter customerConverter;

    @Autowired
    CustomerValidator customerValidator;

    @Override
    public Customer getById(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<CustomerDto> list() {
        return  customerConverter.toDtoList(customerRepository.findAll());
    }


    @Override
    public Customer create(CustomerDto customer) throws BadRequestException {
        customerValidator.validateCustomer(customer);
        return customerRepository.save(customerConverter.toEntity(customer));
    }

}
