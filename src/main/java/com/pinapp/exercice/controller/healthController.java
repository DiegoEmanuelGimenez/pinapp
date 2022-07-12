package com.pinapp.exercice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class healthController {

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
