package com.example.firstspringbootapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="item")
public class ItemEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int itemid;
    private String name;
    private String unit;
    private float price;

    //generate constructor
    public ItemEntity() {
    }

    //generate setter methods for certain attributes 
    public void setName(String name) {
        this.name = name;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //generate getter methods for all attributes
    public int getItemid() {
        return itemid;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public float getPrice() {
        return price;
    }
}