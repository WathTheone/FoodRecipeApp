package com.example.myapplication.view.detail;

import com.example.myapplication.model.Meals;

public interface DetailView {

    void showLoading();
    void hideLoading();
    void setMeal (Meals.Meal meal);
    void onErrorLoading(String message);

}
