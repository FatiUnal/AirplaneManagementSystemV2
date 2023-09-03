package com.example.airplaneprojectv2.dto;

public class ExpeditionDto {
    private String departureAirport;
    private String landingAirport;
    private String expeditionTime;

    public ExpeditionDto(String departureAirport, String landingAirport, String expeditionTime) {
        this.departureAirport = departureAirport;
        this.landingAirport = landingAirport;
        this.expeditionTime = expeditionTime;
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
}
