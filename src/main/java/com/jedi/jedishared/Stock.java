package com.jedi.jedishared;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Stock {
    @Id
    private UUID id;
    private int quantity;
    public Stock() {}
    public void setQuantity(int quantity) {this.quantity = quantity;}
    public int getQuantity() {return quantity;}
    public UUID getId() {return id;}
    public void setId(UUID id) {this.id = id;}
}
