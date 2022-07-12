package com.pinapp.exercice.controller;

import com.pinapp.exercice.dto.CustomerKPIDto;
import com.pinapp.exercice.service.CustomerKPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CustomerKPIController {

    @Autowired
    CustomerKPIService customerKPIService;

    @GetMapping("/kpideclientes")
    public CustomerKPIDto getKPIs() {
        return customerKPIService.getKPIs();
    }

}
