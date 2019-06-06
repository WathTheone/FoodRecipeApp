package com.example.myapplication.view.search_recipe;

import com.example.myapplication.model.Categories;
import com.example.myapplication.model.Meals;

import java.util.List;

public interface search_recipeView {

    void showLoading();
    void hideLoading();
    void setMeal(List<Meals.Meal> meal);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);

}
