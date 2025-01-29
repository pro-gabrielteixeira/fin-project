package com.personal.fin_project.api_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfig {

    @Bean
    public WebClient webClient() {
        return WebClient.builder().baseUrl("https://api.coingecko.com/api/v3/").defaultHeader("Accept", "application/json").build();
    }
}
