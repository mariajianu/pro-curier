package com.procurier.model;

import java.util.Objects;

public class Courier {
    private String companyName;
    private Address headquarters;
    private Long pricePerDistance;
    private Long getPricePerWeight;

    public Courier(String companyName, Address headquarters, Long pricePerDistance, Long getPricePerWeight) {
        this.companyName = Objects.requireNonNull(companyName);
        this.headquarters = Objects.requireNonNull(headquarters);
        this.pricePerDistance = Objects.requireNonNull(pricePerDistance);
        this.getPricePerWeight = Objects.requireNonNull(getPricePerWeight);
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
