package com.Fptu.eCommerce.module.review.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewResponseDto {
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
