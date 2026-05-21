package com.Fptu.eCommerce.module.shipping.mapping;

import com.Fptu.eCommerce.module.shipping.dto.ShippingRequestDto;
import com.Fptu.eCommerce.module.shipping.dto.ShippingResponseDto;
import com.Fptu.eCommerce.module.shipping.entity.ShippingEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ShippingMapper {
    ShippingResponseDto toDTO(ShippingEntity entity);

    ShippingEntity toEntity(ShippingResponseDto dto);

    ShippingEntity toEntity(ShippingRequestDto dto);

    List<ShippingResponseDto> toDTOList(List<ShippingEntity> entities);
}
