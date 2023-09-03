package com.example.airplaneprojectv2.dto;

public class AirplaneDto {
    private String brand;
    private String model;
    private int business;
    private int economy;
    private int defaultBusiness;
    private int defaultEconomy;

    public AirplaneDto(String brand, String model, int business, int economy, int defaultBusiness, int defaultEconomy) {
        this.brand = brand;
        this.model = model;
        this.business = business;
        this.economy = economy;
        this.defaultBusiness = defaultBusiness;
        this.defaultEconomy = defaultEconomy;
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

    public int getDefaultBusiness() {
        return defaultBusiness;
    }

    public void setDefaultBusiness(int defaultBusiness) {
        this.defaultBusiness = defaultBusiness;
    }

    public int getDefaultEconomy() {
        return defaultEconomy;
    }

    public void setDefaultEconomy(int defaultEconomy) {
        this.defaultEconomy = defaultEconomy;
    }
}
