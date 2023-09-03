package com.example.airplaneprojectv2.dto;

import jakarta.persistence.*;

import java.time.LocalDateTime;

public class FlightAdminResponseDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flightId;

    private int expeditionId;
    private String departureAirport;
    private String landingAirport;
    private String expeditionTime;


    private int airplaneId;
    private String brand;
    private String model;
    private int business;
    private int economy;


    private LocalDateTime localDateTime;
    private boolean isActive;
    private int economyPrice;
    private int businessPrice;


    public FlightAdminResponseDto(int flightId, int expeditionId, String departureAirport, String landingAirport, String expeditionTime, int airplaneId, String brand, String model, int business, int economy, LocalDateTime localDateTime, boolean isActive, int economyPrice, int businessPrice) {
        this.flightId = flightId;
        this.expeditionId = expeditionId;
        this.departureAirport = departureAirport;
        this.landingAirport = landingAirport;
        this.expeditionTime = expeditionTime;
        this.airplaneId = airplaneId;
        this.brand = brand;
        this.model = model;
        this.business = business;
        this.economy = economy;
        this.localDateTime = localDateTime;
        this.isActive = isActive;
        this.economyPrice = economyPrice;
        this.businessPrice = businessPrice;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public int getExpeditionId() {
        return expeditionId;
    }

    public void setExpeditionId(int expeditionId) {
        this.expeditionId = expeditionId;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getLandingAirport() {
        return landingAirport;
    }

    public void setLandingAirport(String landingAirport) {
        this.landingAirport = landingAirport;
    }

    public String getExpeditionTime() {
        return expeditionTime;
    }

    public void setExpeditionTime(String expeditionTime) {
        this.expeditionTime = expeditionTime;
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

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getEconomyPrice() {
        return economyPrice;
    }

    public void setEconomyPrice(int economyPrice) {
        this.economyPrice = economyPrice;
    }

    public int getBusinessPrice() {
        return businessPrice;
    }

    public void setBusinessPrice(int businessPrice) {
        this.businessPrice = businessPrice;
    }
}
