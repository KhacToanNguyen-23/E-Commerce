package com.Fptu.eCommerce.module.product.dto;

import com.Fptu.eCommerce.module.category.entity.CategoryEntity;

public class ProductDto {
    private Long id;
    private String name;
    private String description;
    private double price;
    private boolean active;
    private String category_id;
    private String image; // Ảnh chính
    private Integer stockQuantity;

    public ProductDto(double price, Integer stockQuantity, String name, String image, Long id, String description, String category_id, boolean active) {
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.name = name;
        this.image = image;
        this.id = id;
        this.description = description;
        this.category_id = category_id;
        this.active = active;
    }

    public ProductDto() {}

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }
}
