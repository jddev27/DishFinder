package com.example.dishfinder.service;

import com.example.dishfinder.model.DishResponse;
import com.example.dishfinder.dto.DishResponseDto;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

@Service
@AllArgsConstructor
public class DishService {


    private final RestClient restClient;


    public DishResponse getDishByName(String name) {

        String encodedName = URLEncoder.encode(name, StandardCharsets.UTF_8).replace("+", "%20");

        String uri = "https://www.themealdb.com/api/json/v1/1/search.php?s="+encodedName ;
        DishResponseDto result = restClient.get()
                .uri(uri)
                .retrieve()
                .body(DishResponseDto.class);


        DishResponse response = new DishResponse();
        if (Objects.requireNonNull(result).getMeals() != null) {
            response.setIngredients(result.getMeals().getFirst());
        }
        return response;
    }
}
