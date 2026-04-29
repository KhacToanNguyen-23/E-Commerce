package com.Fptu.eCommerce.module.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

import java.time.LocalDateTime;



@Entity
@Table(name = "users")
public class UserEntity {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String role;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public UserEntity() {
    }

    public UserEntity(LocalDateTime createdAt, LocalDateTime updatedAt, String status, String role, String phone, String password, Long id, String email, String name) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.status = status;
        this.role = role;
        this.phone = phone;
        this.password = password;
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
