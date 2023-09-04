package com.example.airplaneprojectv2.dto;

public class ExpeditionResponseDto {
    private int expeditionId;
    private String departureAirport;
    private String landingAirport;
    private String expeditionTime;

    public ExpeditionResponseDto(int expeditionId, String departureAirport, String landingAirport, String expeditionTime) {
        this.expeditionId = expeditionId;
        this.departureAirport = departureAirport;
        this.landingAirport = landingAirport;
        this.expeditionTime = expeditionTime;
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
}
