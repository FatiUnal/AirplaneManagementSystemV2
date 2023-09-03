package com.example.airplaneprojectv2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "airplanes")
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int airplaneId;
    private String brand;
    private String model;
    private int business;
    private int economy;

    @OneToOne(mappedBy = "airplane",cascade = CascadeType.ALL)
    private Flight flight;


    public Airplane(int airplaneId, String brand, String model, int business, int economy) {
        this.airplaneId = airplaneId;
        this.brand = brand;
        this.model = model;
        this.business = business;
        this.economy = economy;

    }

    public Airplane(String brand, String model, int business, int economy) {
        this.brand = brand;
        this.model = model;
        this.business = business;
        this.economy = economy;
    }


    public Airplane() {
    }

    public int getAirplaneId() {
        return airplaneId;
    }

    public void setAirplaneId(int airplaneId) {
        this.airplaneId = airplaneId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBusiness() {
        return business;
    }

    public void setBusiness(int business) {
        this.business = business;
    }

    public int getEconomy() {
        return economy;
    }

    public void setEconomy(int economy) {
        this.economy = economy;
    }

}
