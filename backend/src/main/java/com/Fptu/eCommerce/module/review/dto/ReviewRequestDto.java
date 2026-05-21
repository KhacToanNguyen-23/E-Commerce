package com.Fptu.eCommerce.module.review.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewRequestDto {
    private Long productId;
    private Long userId;
    private Integer rating;
    private String title;
    private String content;
}
