package com.astafievvadim._SystemsTestTask.model;

import jakarta.persistence.*;

@Entity
public class DishMeal {

    @EmbeddedId
    private DishMealId id = new DishMealId();

    @ManyToOne(cascade = CascadeType.DETACH)
    @MapsId("mealId")
    private Meal meal;

    private Dish dish;

    private int count;

    public DishMeal() {
    }

    public DishMeal(DishMealId id, Meal meal, Dish dish, int count) {
        this.id = id;
        this.meal = meal;
        this.dish = dish;
        this.count = count;
    }

    public DishMealId getId() {
        return id;
    }

    public void setId(DishMealId id) {
        this.id = id;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
