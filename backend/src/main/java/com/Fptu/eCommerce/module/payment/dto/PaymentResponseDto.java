package com.Fptu.eCommerce.module.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResponseDto {
    private Long id;
    private Long orderId;
    private Long userId;
    private Double amount;
    private String currency;
    private String paymentMethod;
    private String provider;
    private String transactionReference;
    private String status;
    private LocalDateTime paidAt;
    private LocalDateTime createdAt;
}
