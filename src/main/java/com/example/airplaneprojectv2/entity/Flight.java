package com.example.airplaneprojectv2.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flightId;
    @ManyToOne
    @JoinColumn(name = "expedition_id")
    private Expedition expedition;

    @OneToOne
    @JoinColumn(name = "airplane_id")
    private Airplane airplane;
    private LocalDateTime localDateTime;
    private int emptyEconomySeat;
    private int emptyBusinessSeat;
    private boolean isActive;
    private int economyPrice;
    private int businessPrice;
    private int defBusinessPrice;
    private int defEconomyPrice;

    public Flight(int flightId, Expedition expedition, Airplane airplane, LocalDateTime localDateTime, int emptyEconomySeat, int emptyBusinessSeat, boolean isActive, int economyPrice, int businessPrice,int defBusinessPrice,int defEconomyPrice) {
        this.flightId = flightId;
        this.expedition = expedition;
        this.airplane = airplane;
        this.localDateTime = localDateTime;
        this.emptyEconomySeat = emptyEconomySeat;
        this.emptyBusinessSeat = emptyBusinessSeat;
        this.isActive = isActive;
        this.economyPrice = economyPrice;
        this.businessPrice = businessPrice;
        this.defBusinessPrice=defBusinessPrice;
        this.defEconomyPrice = defEconomyPrice;
    }


    public Flight(Expedition expedition, Airplane airplane, LocalDateTime localDateTime, int emptyEconomySeat, int emptyBusinessSeat, boolean isActive, int economyPrice, int businessPrice, int defBusinessPrice, int defEconomyPrice) {
        this.expedition = expedition;
        this.airplane = airplane;
        this.localDateTime = localDateTime;
        this.emptyEconomySeat = emptyEconomySeat;
        this.emptyBusinessSeat = emptyBusinessSeat;
        this.isActive = isActive;
        this.economyPrice = economyPrice;
        this.businessPrice = businessPrice;
        this.defBusinessPrice = defBusinessPrice;
        this.defEconomyPrice = defEconomyPrice;
    }

    public Flight(Expedition expedition, Airplane airplane, LocalDateTime localDateTime, int emptyEconomySeat, int emptyBusinessSeat, boolean isActive, int economyPrice, int businessPrice) {
        this.expedition = expedition;
        this.airplane = airplane;
        this.localDateTime = localDateTime;
        this.emptyEconomySeat = emptyEconomySeat;
        this.emptyBusinessSeat = emptyBusinessSeat;
        this.isActive = isActive;
        this.economyPrice = economyPrice;
        this.businessPrice = businessPrice;
    }

    public Flight() {
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public Expedition getExpedition() {
        return expedition;
    }

    public void setExpedition(Expedition expedition) {
        this.expedition = expedition;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime  localDateTime) {
        this.localDateTime = localDateTime;
    }

    public int getEmptyEconomySeat() {
        return emptyEconomySeat;
    }

    public void setEmptyEconomySeat(int emptyEconomySeat) {
        this.emptyEconomySeat = emptyEconomySeat;
    }

    public int getEmptyBusinessSeat() {
        return emptyBusinessSeat;
    }

    public void setEmptyBusinessSeat(int emptyBusinessSeat) {
        this.emptyBusinessSeat = emptyBusinessSeat;
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

    public int getDefBusinessPrice() {
        return defBusinessPrice;
    }

    public void setDefBusinessPrice(int defBusinessPrice) {
        this.defBusinessPrice = defBusinessPrice;
    }

    public int getDefEconomyPrice() {
        return defEconomyPrice;
    }

    public void setDefEconomyPrice(int defEconomyPrice) {
        this.defEconomyPrice = defEconomyPrice;
    }
}
