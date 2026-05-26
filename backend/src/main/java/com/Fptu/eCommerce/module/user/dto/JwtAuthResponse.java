package com.Fptu.eCommerce.module.user.dto;

import lombok.Data;

@Data
public class JwtAuthResponse {
    private String accessToken;
    private String tokenType = "Bearer";

    public JwtAuthResponse() {
    }

    public JwtAuthResponse(String accessToken) {
        this.accessToken = accessToken;
    }
}
