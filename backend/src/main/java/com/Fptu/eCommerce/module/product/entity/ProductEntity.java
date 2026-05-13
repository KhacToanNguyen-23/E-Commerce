package com.Fptu.eCommerce.module.product.entity;

import com.Fptu.eCommerce.module.category.entity.CategoryEntity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class ProductEntity {

    private Long id;
    private String name;
    private String description;
    private double price;
    private boolean active;
    @ManyToOne
    private CategoryEntity category;
    private String image; // Ảnh chính
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Integer stockQuantity;

    public ProductEntity() {
    }

    public ProductEntity(boolean active, Integer stockQuantity, LocalDateTime updatedAt, double price, String name, String image, Long id, String description, LocalDateTime createdAt, CategoryEntity category) {
        this.active = active;
        this.stockQuantity = stockQuantity;
        this.updatedAt = updatedAt;
        this.price = price;
        this.name = name;
        this.image = image;
        this.id = id;
        this.description = description;
        this.createdAt = createdAt;
        this.category = category;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }
}

