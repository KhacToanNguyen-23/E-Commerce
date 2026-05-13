package com.Fptu.eCommerce.module.category.mapping;

import com.Fptu.eCommerce.module.product.dto.ProductRequestDto;
import com.Fptu.eCommerce.module.product.dto.ProductResponseDto;
import com.Fptu.eCommerce.module.product.entity.ProductEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapping  {
    ProductResponseDto toDTO(ProductEntity entity);

    ProductEntity toEntity(ProductResponseDto dto);

    ProductEntity toEntity(ProductRequestDto dto);

    List<ProductResponseDto> toDTOList(List<ProductEntity> entities);
}
