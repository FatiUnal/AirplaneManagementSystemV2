package com.example.airplaneprojectv2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "adults")
public class Adult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer adultId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int discount;
    private String role;

    public Adult(Integer adultId, String firstName, String lastName, String email, String password) {
        this.adultId = adultId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.discount = 0;
        this.role = "2";
    }

    public Adult(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.discount = 0;
        this.role = "2";
    }

    public Adult() {
    }

    public Integer getAdultId() {
        return adultId;
    }

    public void setAdultId(Integer adultId) {
        this.adultId = adultId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
