package com.Fptu.eCommerce.module.product.mapping;

import com.Fptu.eCommerce.module.product.dto.ProductRequestDto;
import com.Fptu.eCommerce.module.product.dto.ProductResponseDto;
import com.Fptu.eCommerce.module.product.entity.ProductEntity;
import com.Fptu.eCommerce.module.user.dto.UserRequestDto;
import com.Fptu.eCommerce.module.user.dto.UserResponseDto;
import com.Fptu.eCommerce.module.user.entity.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductResponseDto toDTO(ProductEntity entity);

    ProductEntity toEntity(ProductResponseDto dto);

    ProductEntity toEntity(ProductRequestDto dto);

    List<ProductResponseDto> toDTOList(List<ProductEntity> entities);
}
