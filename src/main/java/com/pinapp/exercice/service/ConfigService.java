package com.pinapp.exercice.service;

import com.pinapp.exercice.entity.Config;

public interface ConfigService {

    Config getConfig(String code);
    Config create(String code, String value);

    Config update(String code, String value);

}
