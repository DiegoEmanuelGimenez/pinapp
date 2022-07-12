package com.pinapp.exercice.controller;

import com.pinapp.exercice.entity.Config;
import com.pinapp.exercice.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ConfigController {

    @Autowired
    ConfigService configService;

    @GetMapping("/config/{code}")
    public Config get(@PathVariable String code) {
        return configService.getConfig(code);
    }

    @PostMapping("/config")
    public Config create(@RequestBody Config config) {
        return configService.create(config.getCode(), config.getValue());
    }

    @PutMapping("/config/{code}")
    public Config update(@PathVariable String code, @RequestBody Config config) {
        return configService.update(code, config.getValue());
    }
}
