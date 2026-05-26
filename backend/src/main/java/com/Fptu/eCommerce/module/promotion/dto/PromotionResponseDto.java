package com.Fptu.eCommerce.module.promotion.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PromotionResponseDto {
    private Long id;
    private String code;
    private String name;
    private String description;
    private String discountType;
    private Double discountValue;
    private Double minOrderValue;
    private Double maxDiscountValue;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private Integer usageLimit;
    private Integer usedCount;
    private Boolean active;
}
