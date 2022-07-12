package com.pinapp.exercice.service;

import com.pinapp.exercice.dto.CustomerKPIDto;
import com.pinapp.exercice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerKPIServiceImpl implements CustomerKPIService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public CustomerKPIDto getKPIs() {
        CustomerKPIDto dto = new CustomerKPIDto();
        dto.setAgeAverage((customerRepository.getAgeAverage() != null) ? customerRepository.getAgeAverage(): 0);
        dto.setAgeStandardDeviation((customerRepository.getAgeStandardDeviation() != null) ? customerRepository.getAgeStandardDeviation() : 0);
        return dto;
    }
}
