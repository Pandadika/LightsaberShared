package com.jedi.jedishared;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "\"USER\"")
public class User {

  @Id
  @Column(name = "username")
  private String username;

  @Column(name = "password")
  private String password;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "sur_name")
  private String surName;

  @Column(name = "email")
  private String email;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  private List<BoughtItem> boughtItems = new ArrayList<>();

  @Column(name = "is_admin")
  private boolean isAdmin = false;

  public User() {}
  public User(String username, String password, List<Item> boughtItems) {}

  public void setUsername(String username) { this.username = username; }
  public String getUsername() { return username; }

  public void setPassword(String password) { this.password = password; }
  public String getPassword() { return this.password; }

  public void setBoughtItems(List<BoughtItem> boughtItems) { this.boughtItems = boughtItems; }
  public List<BoughtItem> getBoughtItems() { return this.boughtItems; }

  public void setIsAdmin(boolean isAdmin) { this.isAdmin = isAdmin; }
  public boolean isAdmin() { return isAdmin; }

  public void setSurName(String surName) { this.surName = surName; }
  public String getSurName() { return this.surName; }

  public void setEmail(String email) { this.email = email; }
  public String getEmail() { return this.email; }

  public void setFirstName(String firstName) { this.firstName = firstName; }
  public String getFirstName() { return this.firstName; }

}

