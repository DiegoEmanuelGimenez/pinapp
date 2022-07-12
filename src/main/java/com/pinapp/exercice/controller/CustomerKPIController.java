package com.pinapp.exercice.controller;

import com.pinapp.exercice.dto.CustomerKPIDto;
import com.pinapp.exercice.service.CustomerKPIService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CustomerKPIController {

    @Autowired
    CustomerKPIService customerKPIService;

    @GetMapping(value = "/kpideclientes", produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerKPIDto getKPIs() {
        return customerKPIService.getKPIs();
    }

}
