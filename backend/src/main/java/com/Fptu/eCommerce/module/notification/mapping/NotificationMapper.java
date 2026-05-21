package com.Fptu.eCommerce.module.notification.mapping;

import com.Fptu.eCommerce.module.notification.dto.NotificationRequestDto;
import com.Fptu.eCommerce.module.notification.dto.NotificationResponseDto;
import com.Fptu.eCommerce.module.notification.entity.NotificationEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NotificationMapper {
    NotificationResponseDto toDTO(NotificationEntity entity);

    NotificationEntity toEntity(NotificationResponseDto dto);

    NotificationEntity toEntity(NotificationRequestDto dto);

    List<NotificationResponseDto> toDTOList(List<NotificationEntity> entities);
}
