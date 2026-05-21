package com.Fptu.eCommerce.module.inventory.service;

import com.Fptu.eCommerce.module.inventory.dto.InventoryRequestDto;
import com.Fptu.eCommerce.module.inventory.dto.InventoryResponseDto;
import java.util.List;

public interface IInventoryService {
    List<InventoryResponseDto> getAll();

    InventoryResponseDto getById(Long id);

    InventoryResponseDto create(InventoryRequestDto requestDto);

    InventoryResponseDto update(Long id, InventoryRequestDto requestDto);

    void delete(Long id);
}
