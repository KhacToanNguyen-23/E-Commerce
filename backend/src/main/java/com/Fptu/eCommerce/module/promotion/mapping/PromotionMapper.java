package com.Fptu.eCommerce.module.promotion.mapping;

import com.Fptu.eCommerce.module.promotion.dto.PromotionRequestDto;
import com.Fptu.eCommerce.module.promotion.dto.PromotionResponseDto;
import com.Fptu.eCommerce.module.promotion.entity.PromotionEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PromotionMapper {
    PromotionResponseDto toDTO(PromotionEntity entity);

    PromotionEntity toEntity(PromotionResponseDto dto);

    PromotionEntity toEntity(PromotionRequestDto dto);

    List<PromotionResponseDto> toDTOList(List<PromotionEntity> entities);
}
