package com.jedi.jedishared;

import jakarta.persistence.*;

@Entity
@Table(name = "BOUGHT_ITEM")
public class BoughtItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "username")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    private int quantity;

    public BoughtItem() {}

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() { return id; }
    public void setUser(User user) { this.user = user; }
    public User getUser() { return user; }
    public void setItem(Item item) { this.item = item; }
    public Item getItem() { return item; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public int getQuantity() { return quantity; }
    // Constructors, getters, and setters
}
