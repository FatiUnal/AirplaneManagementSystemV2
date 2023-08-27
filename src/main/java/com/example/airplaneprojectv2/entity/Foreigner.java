package com.example.airplaneprojectv2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "foreigners")
public class Foreigner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer foreignerId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int discount;
    private String role;

    public Foreigner() {
    }

    public Foreigner(Integer foreignerId, String firstName, String lastName, String email, String password) {
        this.foreignerId = foreignerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.discount = 0;
        this.role = "5";
    }

    public Foreigner(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.discount = 0;
        this.role = "5";
    }

    public Integer getForeignerId() {
        return foreignerId;
    }

    public void setForeignerId(Integer foreignerId) {
        this.foreignerId = foreignerId;
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
