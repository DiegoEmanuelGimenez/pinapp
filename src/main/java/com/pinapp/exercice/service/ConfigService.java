package com.pinapp.exercice.service;

import com.pinapp.exercice.entity.Config;

public interface ConfigService {

    Config getConfig(String key);

    Config updateConfig(String key, String value);

}
