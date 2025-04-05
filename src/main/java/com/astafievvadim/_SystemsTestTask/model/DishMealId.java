package com.astafievvadim._SystemsTestTask.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class DishMealId  implements Serializable {


    @Column(name = "dish_id")
    private Long dish_id;

    @Column(name = "meal_id")
    private Long meal_id;

    public DishMealId() {
    }

    public DishMealId(Long dish_id, Long meal_id) {
        this.dish_id = dish_id;
        this.meal_id = meal_id;
    }

    public Long getDish_id() {
        return dish_id;
    }

    public void setDish_id(Long dish_id) {
        this.dish_id = dish_id;
    }

    public Long getMeal_id() {
        return meal_id;
    }

    public void setMeal_id(Long meal_id) {
        this.meal_id = meal_id;
    }
}
