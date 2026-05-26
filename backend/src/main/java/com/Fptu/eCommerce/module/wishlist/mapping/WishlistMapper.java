package com.Fptu.eCommerce.module.wishlist.mapping;

import com.Fptu.eCommerce.module.wishlist.dto.WishlistRequestDto;
import com.Fptu.eCommerce.module.wishlist.dto.WishlistResponseDto;
import com.Fptu.eCommerce.module.wishlist.entity.WishlistEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WishlistMapper {
    WishlistResponseDto toDTO(WishlistEntity entity);

    WishlistEntity toEntity(WishlistResponseDto dto);

    WishlistEntity toEntity(WishlistRequestDto dto);

    List<WishlistResponseDto> toDTOList(List<WishlistEntity> entities);
}
