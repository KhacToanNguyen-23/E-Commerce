package com.Fptu.eCommerce.module.shipping.service.imp;

import com.Fptu.eCommerce.module.shipping.dto.ShippingRequestDto;
import com.Fptu.eCommerce.module.shipping.dto.ShippingResponseDto;
import com.Fptu.eCommerce.module.shipping.service.IShippingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingService implements IShippingService {
    @Override
    public List<ShippingResponseDto> getAll() {
        return List.of();
    }

    @Override
    public ShippingResponseDto getById(Long id) {
        return null;
    }

    @Override
    public ShippingResponseDto create(ShippingRequestDto requestDto) {
        return null;
    }

    @Override
    public ShippingResponseDto update(Long id, ShippingRequestDto requestDto) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }
}
