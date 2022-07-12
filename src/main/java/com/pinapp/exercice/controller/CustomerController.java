package com.pinapp.exercice.controller;

import com.pinapp.exercice.dto.CustomerDto;
import com.pinapp.exercice.entity.Customer;
import com.pinapp.exercice.exception.BadRequestException;
import com.pinapp.exercice.service.CustomerService;
import com.pinapp.exercice.swagger.ConstantSwagger;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Operation(summary = "Crear clientes", responses = {
            @ApiResponse(description = "OK", responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = Customer.class), examples = {@ExampleObject(value = ConstantSwagger.CREATE_CLIENT_RESPONSE_OK)})),
            @ApiResponse(description = "BAD_REQUEST", responseCode = "400A", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = BadRequestException.class), examples = {@ExampleObject(value = ConstantSwagger.CREATE_CLIENT_RESPONSE_BAD_1)})),
            @ApiResponse(description = "BAD_REQUEST", responseCode = "400B", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = BadRequestException.class), examples = {@ExampleObject(value = ConstantSwagger.CREATE_CLIENT_RESPONSE_BAD_2)})),
            @ApiResponse(description = "BAD_REQUEST", responseCode = "400C", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = BadRequestException.class), examples = {@ExampleObject(value = ConstantSwagger.CREATE_CLIENT_RESPONSE_BAD_3)})),
            @ApiResponse(description = "BAD_REQUEST", responseCode = "400D", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = BadRequestException.class), examples = {@ExampleObject(value = ConstantSwagger.CREATE_CLIENT_RESPONSE_BAD_4)})),
            @ApiResponse(description = "BAD_REQUEST2", responseCode = "400E", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = BadRequestException.class), examples = {@ExampleObject(value = ConstantSwagger.CREATE_CLIENT_RESPONSE_BAD_5)})),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content)
    })
    @PostMapping(value = "/creacliente", produces = MediaType.APPLICATION_JSON_VALUE)
    public Customer create(@RequestBody CustomerDto customer) {
        return customerService.create(customer);
    }

    @GetMapping(value = "/listclientes", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CustomerDto> list() {
        return customerService.list();
    }
}
