package com.procurier.model;
import java.util.Objects;

public final class Product {
    private Long price;
    private String name;
    private String description;
    private Long weight;

    public Product(Long price, String name, String description, Long weight) {
        this.price = Objects.requireNonNull(price);
        this.name = Objects.requireNonNull(name);
        this.description = Objects.requireNonNull(description);
        this.weight = checkWeigth(weight);
    }

    private static Long checkWeigth(Long weight){
        if(weight < 0)
            throw new IllegalArgumentException("Weight must be non negative");
        return Objects.requireNonNull(weight);
    }
    public Long getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Long getWeight() {
        return weight;
    }
}
