package com.Fptu.eCommerce.module.review.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "review")
public class ReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productId;
    private Long userId;
    private Integer rating;
    private String title;
    private String content;
    private Boolean verifiedPurchase;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
