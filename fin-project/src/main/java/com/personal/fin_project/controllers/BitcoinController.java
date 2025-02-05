package com.personal.fin_project.controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.personal.fin_project.services.ApiConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bitcoin")
public class BitcoinController {

    @Autowired
    private ApiConfigService apiConfigService;

    @GetMapping("/price")
    public String getPrice() {
        return apiConfigService.getBitcoinPrice();
    }
}
