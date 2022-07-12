package com.pinapp.exercice.dto;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "DTO de KPIs de customer")
public class CustomerKPIDto {

    private Double ageAverage;

    private Double ageStandardDeviation;

    public Double getAgeAverage() {
        return ageAverage;
    }

    public void setAgeAverage(Double ageAverage) {
        this.ageAverage = ageAverage;
    }

    public Double getAgeStandardDeviation() {
        return ageStandardDeviation;
    }

    public void setAgeStandardDeviation(Double ageStandardDeviation) {
        this.ageStandardDeviation = ageStandardDeviation;
    }
}
