package com.Fptu.eCommerce.module.shipping.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "shipping")
public class ShippingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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
    private String trackingNumber;
    private String status;
    private LocalDateTime estimatedDeliveryAt;
    private LocalDateTime shippedAt;
    private LocalDateTime deliveredAt;
}
