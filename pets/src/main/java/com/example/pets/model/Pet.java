package com.example.pets.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pet {

    @Id
    @GeneratedValue
    private Long id;
    private String type;
    private double price;

    public Pet() {}

    public Pet(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public Pet(Long id, String type, double price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
