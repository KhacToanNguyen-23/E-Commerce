package com.Fptu.eCommerce.module.inventory.mapping;

import com.Fptu.eCommerce.module.inventory.dto.InventoryRequestDto;
import com.Fptu.eCommerce.module.inventory.dto.InventoryResponseDto;
import com.Fptu.eCommerce.module.inventory.entity.InventoryEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InventoryMapper {
    InventoryResponseDto toDTO(InventoryEntity entity);

    InventoryEntity toEntity(InventoryResponseDto dto);

    InventoryEntity toEntity(InventoryRequestDto dto);

    List<InventoryResponseDto> toDTOList(List<InventoryEntity> entities);
}
