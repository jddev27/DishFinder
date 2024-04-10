package com.example.dishfinder.controller;

import com.example.dishfinder.service.DishService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/ingredients")
public class DishController {

    private final DishService dishService;

    public DishController(DishService dishService) {
        this.dishService = dishService;
    }

    @GetMapping(path = "{name}")
    public List<String> getIngredientsByRecipeName(@PathVariable("name") String name){

        return dishService.getIngredientsByRecipeName(name);
    }
}
