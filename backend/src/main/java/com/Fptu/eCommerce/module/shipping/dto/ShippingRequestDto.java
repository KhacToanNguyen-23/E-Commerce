package com.Fptu.eCommerce.module.shipping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShippingRequestDto {
    private Long orderId;
    private Long userId;
    private String recipientName;
    private String recipientPhone;
    private String addressLine;
    private String ward;
    private String district;
    private String city;
    private String postalCode;
    private String country;
    private String shippingMethod;
    private Double shippingFee;
    private LocalDateTime estimatedDeliveryAt;
}
