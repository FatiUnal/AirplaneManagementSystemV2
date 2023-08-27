package com.example.airplaneprojectv2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "disableds")
public class Disabled {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer disabledId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int discount;
    private String role;

    public Disabled() {
    }

    public Disabled(Integer disabledId, String firstName, String lastName, String email, String password) {
        this.disabledId = disabledId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.discount = 50;
        this.role = "4";
    }

    public Disabled(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.discount = 50;
        this.role = "4";
    }

    public Integer getDisabledId() {
        return disabledId;
    }

    public void setDisabledId(Integer disabledId) {
        this.disabledId = disabledId;
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
