package com.mariacesarotti.embraer_api.dto;

public class CalculationResponse {

    private Integer maxPassengers;

    public CalculationResponse() {
    }

    public CalculationResponse(Integer maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public Integer getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(Integer maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
}
