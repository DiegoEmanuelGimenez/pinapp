package com.pinapp.exercice.service;

import com.pinapp.exercice.entity.Config;
import com.pinapp.exercice.exception.BadRequestException;
import com.pinapp.exercice.repository.ConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigServiceImpl implements ConfigService {

    @Autowired
    ConfigRepository configRepository;

    @Override
    public Config getConfig(String key) {
        return configRepository.findByCode(key);
    }

    @Override
    public Config updateConfig(String key, String value) {
        Config config = configRepository.findByCode(key);
        if (config == null) {
           throw new BadRequestException("config not found");
        }
        config.setValue(value);
        return configRepository.save(config);
    }
}
