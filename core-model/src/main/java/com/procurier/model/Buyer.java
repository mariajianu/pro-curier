package com.procurier.model;

import java.util.Objects;

public class Buyer {
    private String name;
    private Address address;

    public Buyer(String name, Address address) {
        this.name = Objects.requireNonNull(name);
        this.address = Objects.requireNonNull(address);
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
