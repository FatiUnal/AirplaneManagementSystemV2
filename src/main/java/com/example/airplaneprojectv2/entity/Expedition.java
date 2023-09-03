package com.example.airplaneprojectv2.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "expeditions")
public class Expedition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int expeditionId;
    private String departureAirport;
    private String landingAirport;
    private String expeditionTime;
    @OneToMany(mappedBy = "expedition",cascade = CascadeType.ALL)
    private List<Flight> flight;

    public Expedition(int expeditionId, String departureAirport, String landingAirport, String expeditionTime) {
        this.expeditionId = expeditionId;
        this.departureAirport = departureAirport;
        this.landingAirport = landingAirport;
        this.expeditionTime = expeditionTime;
    }

    public Expedition(String departureAirport, String landingAirport, String expeditionTime) {
        this.departureAirport = departureAirport;
        this.landingAirport = landingAirport;
        this.expeditionTime = expeditionTime;
    }

    public Expedition() {
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

    public List<Flight> getFlight() {
        return flight;
    }

    public void setFlight(List<Flight> flight) {
        this.flight = flight;
    }
}
