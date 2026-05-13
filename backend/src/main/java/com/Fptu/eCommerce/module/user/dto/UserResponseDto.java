package com.Fptu.eCommerce.module.user.dto;

import lombok.Data;


@Data

public class UserResponseDto {
    private String username;
    private String phone;
    private String email;
    private String address;
    private String city;

    public UserResponseDto() {
    }

    public UserResponseDto(String username, String city, String address, String email, String phone) {
        this.username = username;
        this.city = city;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
