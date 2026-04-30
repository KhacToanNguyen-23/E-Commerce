package com.Fptu.eCommerce.module.category.entity;

public class CategoryEntity {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private boolean active = true;

    public CategoryEntity(boolean active, Double price, String name, Long id, String description) {
        this.active = active;
        this.price = price;
        this.name = name;
        this.id = id;
        this.description = description;
    }
    public CategoryEntity() {}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }


}
