package com.example.dishfinder.service;

import com.example.dishfinder.dto.ChatRequest;
import com.example.dishfinder.dto.ChatResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DishService {

    private final RestTemplate restTemplate;

    @Value("${openai.model}")
    private String model;

    @Value("${openai.api.url}")
    private String apiUrl;


    public DishService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<String> getIngredientsByRecipeName(String name) {

        String prompt = "Give me a list of most common ingredients for the following dish: " + name;

        ChatRequest request = new ChatRequest(model, prompt);

        ChatResponse response = restTemplate.postForObject(apiUrl, request, ChatResponse.class);

        if (response == null || response.getChoices() == null || response.getChoices().isEmpty()) {
            return null;
        }

        String content = response.getChoices().getFirst().getMessage().getContent();
        String[] items = content.split("\n");
        List<String> dishList = new ArrayList<>();

        Arrays.stream(items).forEach(item -> dishList.add(item.replaceAll("^\\d+\\.\\s*", "")));

        return dishList;
    }
}
