package com.example.dishfinder.dto;

import com.example.dishfinder.model.Meal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DishResponseDto {
    private List<Meal> meals;

}