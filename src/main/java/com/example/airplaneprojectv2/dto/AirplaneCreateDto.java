package com.example.airplaneprojectv2.dto;

public class AirplaneCreateDto {
    private String brand;
    private String model;
    private int business;
    private int economy;

    public AirplaneCreateDto(String brand, String model, int business, int economy) {
        this.brand = brand;
        this.model = model;
        this.business = business;
        this.economy = economy;
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
