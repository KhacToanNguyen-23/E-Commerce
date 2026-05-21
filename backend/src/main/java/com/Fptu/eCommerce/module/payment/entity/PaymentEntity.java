package com.Fptu.eCommerce.module.payment.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payment")
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
