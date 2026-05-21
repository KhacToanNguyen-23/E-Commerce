package com.Fptu.eCommerce.module.media.mapping;

import com.Fptu.eCommerce.module.media.dto.MediaRequestDto;
import com.Fptu.eCommerce.module.media.dto.MediaResponseDto;
import com.Fptu.eCommerce.module.media.entity.MediaEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MediaMapper {
    MediaResponseDto toDTO(MediaEntity entity);

    MediaEntity toEntity(MediaResponseDto dto);

    MediaEntity toEntity(MediaRequestDto dto);

    List<MediaResponseDto> toDTOList(List<MediaEntity> entities);
}
