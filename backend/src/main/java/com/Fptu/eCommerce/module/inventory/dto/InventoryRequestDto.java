package com.Fptu.eCommerce.module.inventory.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryRequestDto {
    private Long productId;
    private String sku;
    private Integer quantityAvailable;
    private Integer quantityReserved;
    private Integer lowStockThreshold;
    private String warehouseLocation;
}
