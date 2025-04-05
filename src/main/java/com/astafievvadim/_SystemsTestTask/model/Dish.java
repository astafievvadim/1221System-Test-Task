package com.astafievvadim._SystemsTestTask.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class Dish implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Short calories;
    private Short proteins;
    private Short carbs;
    private Short fats;

    public Dish(Long id, String name, Short calories, Short proteins, Short carbs, Short fats) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.proteins = proteins;
        this.carbs = carbs;
        this.fats = fats;
    }

    public Dish() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getCalories() {
        return calories;
    }

    public void setCalories(Short calories) {
        this.calories = calories;
    }

    public Short getProteins() {
        return proteins;
    }

    public void setProteins(Short proteins) {
        this.proteins = proteins;
    }

    public Short getCarbs() {
        return carbs;
    }

    public void setCarbs(Short carbs) {
        this.carbs = carbs;
    }

    public Short getFats() {
        return fats;
    }

    public void setFats(Short fats) {
        this.fats = fats;
    }
}
