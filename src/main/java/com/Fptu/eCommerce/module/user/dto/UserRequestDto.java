package com.Fptu.eCommerce.module.user.dto;

public class UserRequestDto {
    private Long id;
    private String username;
    private String password;
    private String phone;
    private String email;
    private String address;
    private String city;
    private String state;
    private String country;

    public UserRequestDto() {
    }

    public UserRequestDto(String address, String username, String phone, Long id, String email, String country, String city, String password, String state) {
        this.address = address;
        this.username = username;
        this.phone = phone;
        this.id = id;
        this.email = email;
        this.country = country;
        this.city = city;
        this.password = password;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
