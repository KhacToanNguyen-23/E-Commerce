package com.Fptu.eCommerce.module.review.mapping;

import com.Fptu.eCommerce.module.review.dto.ReviewRequestDto;
import com.Fptu.eCommerce.module.review.dto.ReviewResponseDto;
import com.Fptu.eCommerce.module.review.entity.ReviewEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReviewMapper {
    ReviewResponseDto toDTO(ReviewEntity entity);

    ReviewEntity toEntity(ReviewResponseDto dto);

    ReviewEntity toEntity(ReviewRequestDto dto);

    List<ReviewResponseDto> toDTOList(List<ReviewEntity> entities);
}
