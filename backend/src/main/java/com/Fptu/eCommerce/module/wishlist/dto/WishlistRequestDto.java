package com.Fptu.eCommerce.module.wishlist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WishlistRequestDto {
    private Long userId;
    private Long productId;
}
