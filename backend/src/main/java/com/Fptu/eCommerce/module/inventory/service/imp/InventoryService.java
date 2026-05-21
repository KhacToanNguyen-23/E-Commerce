package com.Fptu.eCommerce.module.inventory.service.imp;

import com.Fptu.eCommerce.module.inventory.dto.InventoryRequestDto;
import com.Fptu.eCommerce.module.inventory.dto.InventoryResponseDto;
import com.Fptu.eCommerce.module.inventory.service.IInventoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService implements IInventoryService {
    @Override
    public List<InventoryResponseDto> getAll() {
        return List.of();
    }

    @Override
    public InventoryResponseDto getById(Long id) {
        return null;
    }

    @Override
    public InventoryResponseDto create(InventoryRequestDto requestDto) {
        return null;
    }

    @Override
    public InventoryResponseDto update(Long id, InventoryRequestDto requestDto) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }
}
