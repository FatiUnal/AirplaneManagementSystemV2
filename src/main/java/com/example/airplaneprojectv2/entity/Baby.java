package com.example.airplaneprojectv2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "babys")
public class Baby {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer babyId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int discount;
    private String role;

    public Baby(Integer babyId, String firstName, String lastName, String email, String password) {
        this.babyId = babyId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.discount = 80;
        this.role = "3";
    }
    public Baby(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.discount = 80;
        this.role = "3";
    }

    public Baby() {
    }

    public Integer getBabyId() {
        return babyId;
    }

    public void setBabyId(Integer babyId) {
        this.babyId = babyId;
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
