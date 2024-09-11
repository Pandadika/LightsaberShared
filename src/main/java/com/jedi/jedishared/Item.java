package com.jedi.jedishared;

import org.jetbrains.annotations.Nullable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.UUID;

@Entity
public class Item implements Serializable {
    @Id
    private UUID id;
    private String name;
    private Component component;
    private double price;
    @Nullable
    private String description;

    public Item() {}

    public Item(UUID id, String name, Component component, double price, @Nullable String description) {
        this.id = id;
        this.name = name;
        this.component = component;
        this.price = price;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@Nullable String description) {
        this.description = description;
    }
}