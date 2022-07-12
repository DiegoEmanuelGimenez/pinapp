package com.pinapp.exercice.validator;

import com.pinapp.exercice.dto.CustomerDto;
import com.pinapp.exercice.exception.BadRequestException;
import org.springframework.stereotype.Component;


@Component
public class CustomerValidator {

    public void validateCustomer(CustomerDto customer) throws BadRequestException {
        validateAgeWithBirtdate(customer);
    }

    private void validateAgeWithBirtdate(CustomerDto customer) throws BadRequestException {
        if(customer.getAge() == null) {
            throw new BadRequestException("Age can not be null");
        }

        if(customer.getBirthDate() == null) {
            throw new BadRequestException("BirthDate can not be null");
        }

        if (!customer.getAge().equals(customer.getCalculateAge())) {
            throw new BadRequestException("BirthDate or Age inconsistent");
        }
    }

}
