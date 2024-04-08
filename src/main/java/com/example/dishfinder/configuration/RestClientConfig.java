package com.example.dishfinder.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {

    @Value("${openai.api-key}")
    private String openaiApiKey;

    @Bean
    public RestClient getRestClient(){

        return RestClient.create();
    }
}
