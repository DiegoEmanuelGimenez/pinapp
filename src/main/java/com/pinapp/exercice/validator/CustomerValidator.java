package com.pinapp.exercice.validator;

import com.pinapp.exercice.dto.CustomerDto;
import com.pinapp.exercice.exception.BadRequestException;
import com.pinapp.exercice.util.Utils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;


@Component
public class CustomerValidator {

    public void validateCustomer(CustomerDto customer) throws BadRequestException {
        if(StringUtils.isBlank(customer.getName())) {
            throw new BadRequestException("name can not be empty");
        }

        if(StringUtils.isBlank(customer.getLastname())) {
            throw new BadRequestException("lastname can not be empty");
        }

        if(customer.getAge() == null) {
            throw new BadRequestException("Age can not be empty");
        }

        if(Utils.isValidDate(customer.getBirthDate())) {
            throw new BadRequestException("BirthDate can not be empty");
        }

        if (!customer.getAge().equals(customer.getCalculateAge())) {
            throw new BadRequestException("BirthDate or Age is inconsistent");
        }
    }

}
