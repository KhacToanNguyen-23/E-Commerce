package com.Fptu.eCommerce.module.user.dto;

import org.antlr.v4.runtime.misc.NotNull;

import lombok.Data;

@Data
public class RegisterRequest {

    @NotNull
    private String username;
    @NotNull
    private String password;
    private String phone;
    @NotNull            
    
    private String email;
    private String address;
    private String city;
    private String state;
    private String country;

    public RegisterRequest() {
    }

    public RegisterRequest(String address, String username, String phone, String email, String country, String city, String password, String state) {
        this.address = address;
        this.username = username;
        this.phone = phone;
        this.email = email;
        this.country = country;
        this.city = city;
        this.password = password;
        this.state = state;
    }
    
}
