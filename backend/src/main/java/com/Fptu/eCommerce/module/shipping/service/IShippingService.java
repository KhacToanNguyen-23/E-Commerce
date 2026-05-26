package com.Fptu.eCommerce.module.shipping.service;

import com.Fptu.eCommerce.module.shipping.dto.ShippingRequestDto;
import com.Fptu.eCommerce.module.shipping.dto.ShippingResponseDto;
import java.util.List;

public interface IShippingService {
    List<ShippingResponseDto> getAll();

    ShippingResponseDto getById(Long id);

    ShippingResponseDto create(ShippingRequestDto requestDto);

    ShippingResponseDto update(Long id, ShippingRequestDto requestDto);

    void delete(Long id);
}
