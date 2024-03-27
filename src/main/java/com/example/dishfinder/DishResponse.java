package com.example.dishfinder;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class DishResponse {

    private List<String> ingredients = new ArrayList<>();

    public DishResponse(){};

    public DishResponse(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void setIngredients(Meal meal) {

        String[] mealIngredients = {
                meal.getStrIngredient1(),
                meal.getStrIngredient2(),
                meal.getStrIngredient3(),
                meal.getStrIngredient4(),
                meal.getStrIngredient5(),
                meal.getStrIngredient6(),
                meal.getStrIngredient7(),
                meal.getStrIngredient8(),
                meal.getStrIngredient9(),
                meal.getStrIngredient10(),
                meal.getStrIngredient11(),
                meal.getStrIngredient12(),
                meal.getStrIngredient13(),
                meal.getStrIngredient14(),
                meal.getStrIngredient15(),
                meal.getStrIngredient16(),
                meal.getStrIngredient17(),
                meal.getStrIngredient18(),
                meal.getStrIngredient19(),
                meal.getStrIngredient20(),
        };

        for(String ingredient : mealIngredients){
            if (ingredient != null && !ingredient.isEmpty()) {
                ingredients.add(ingredient);
            }
        }
    }


}
