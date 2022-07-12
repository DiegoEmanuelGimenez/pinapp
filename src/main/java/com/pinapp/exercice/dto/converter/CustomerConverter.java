package com.pinapp.exercice.dto.converter;

import com.pinapp.exercice.constants.ConstantConfig;
import com.pinapp.exercice.dto.CustomerDto;
import com.pinapp.exercice.entity.Config;
import com.pinapp.exercice.entity.Customer;
import com.pinapp.exercice.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerConverter extends GenericConverter<CustomerDto, Customer> {

    @Autowired
    private ConfigService configService;

    @Override
    public CustomerDto toDto(Customer entity) {
        CustomerDto dto = new CustomerDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setLastname(entity.getLastname());
        dto.setBirthDate(entity.getBirthdate());
        dto.setAge(entity.getAge());
        Config config = configService.getConfig(ConstantConfig.CONFIG_LIFE_EXPECTANCY_AVG);
        Double lifeExpentancy = (config != null) ? config.getDoubleValue() : ConstantConfig.CONFIG_LIFE_EXPECTANCY_AVG_DEFAULT;
        dto.getDateOfDeath(lifeExpentancy);
        return dto;
    }

    @Override
    public Customer toEntity(CustomerDto dto) {
        Customer entity = null;
        if (dto != null) {
            entity = new Customer();
            entity.setName(dto.getName());
            entity.setLastname(dto.getLastname());
            entity.setAge(dto.getAge());
            entity.setBirthdate(dto.getBirthDate());
        }

        return entity;
    }
}
