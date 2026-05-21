package com.Fptu.eCommerce.module.promotion.service;

import com.Fptu.eCommerce.module.promotion.dto.PromotionRequestDto;
import com.Fptu.eCommerce.module.promotion.dto.PromotionResponseDto;
import java.util.List;

public interface IPromotionService {
    List<PromotionResponseDto> getAll();

    PromotionResponseDto getById(Long id);

    PromotionResponseDto create(PromotionRequestDto requestDto);

    PromotionResponseDto update(Long id, PromotionRequestDto requestDto);

    void delete(Long id);
}
