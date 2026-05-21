package com.Fptu.eCommerce.module.wishlist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WishlistResponseDto {
    private Long id;
    private Long userId;
    private Long productId;
    private LocalDateTime createdAt;
}
