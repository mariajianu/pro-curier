package com.procurier.model;

import java.util.Objects;

public class Courier {
    private Long id;
    private String companyName;
    private Address headquarters;
    private Long pricePerDistance;
    private Long getPricePerWeight;

    public Courier(Long id, String companyName, Address headquarters, Long pricePerDistance, Long getPricePerWeight) {
        this.id = Objects.requireNonNull(id);
        this.companyName = Objects.requireNonNull(companyName);
        this.headquarters = Objects.requireNonNull(headquarters);
        this.pricePerDistance = Objects.requireNonNull(pricePerDistance);
        this.getPricePerWeight = Objects.requireNonNull(getPricePerWeight);
    }

    public Long getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Address getHeadquarters() {
        return headquarters;
    }

    public Long getPricePerDistance() {
        return pricePerDistance;
    }

    public Long getGetPricePerWeight() {
        return getPricePerWeight;
    }


}
