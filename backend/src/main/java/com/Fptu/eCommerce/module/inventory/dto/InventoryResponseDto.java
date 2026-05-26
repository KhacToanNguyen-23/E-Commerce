package com.Fptu.eCommerce.module.inventory.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryResponseDto {
    private Long id;
    private Long productId;
    private String sku;
    private Integer quantityAvailable;
    private Integer quantityReserved;
    private Integer lowStockThreshold;
    private String warehouseLocation;
    private LocalDateTime updatedAt;
}
