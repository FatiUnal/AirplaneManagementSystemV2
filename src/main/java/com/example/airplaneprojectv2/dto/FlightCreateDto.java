package com.example.airplaneprojectv2.dto;

import com.example.airplaneprojectv2.entity.Airplane;
import com.example.airplaneprojectv2.entity.Expedition;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

public class FlightCreateDto {
    private int expedition_id;
    private int airplane_id;
    private String localDateTime;
    private boolean isActive;
    private int economyPrice;
    private int businessPrice;

    public FlightCreateDto( int expedition_id, int airplane_id, String localDateTime, boolean isActive, int economyPrice, int businessPrice) {
        this.expedition_id = expedition_id;
        this.airplane_id = airplane_id;
        this.localDateTime = localDateTime;
        this.isActive = isActive;
        this.economyPrice = economyPrice;
        this.businessPrice = businessPrice;
    }

    public int getExpedition_id() {
        return expedition_id;
    }

    public void setExpedition_id(int expedition_id) {
        this.expedition_id = expedition_id;
    }

    public int getAirplane_id() {
        return airplane_id;
    }

    public void setAirplane_id(int airplane_id) {
        this.airplane_id = airplane_id;
    }

    public String getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(String localDateTime) {
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
