package com.Fptu.eCommerce.module.promotion.service.imp;

import com.Fptu.eCommerce.module.promotion.dto.PromotionRequestDto;
import com.Fptu.eCommerce.module.promotion.dto.PromotionResponseDto;
import com.Fptu.eCommerce.module.promotion.service.IPromotionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionService implements IPromotionService {
    @Override
    public List<PromotionResponseDto> getAll() {
        return List.of();
    }

    @Override
    public PromotionResponseDto getById(Long id) {
        return null;
    }

    @Override
    public PromotionResponseDto create(PromotionRequestDto requestDto) {
        return null;
    }

    @Override
    public PromotionResponseDto update(Long id, PromotionRequestDto requestDto) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }
}
