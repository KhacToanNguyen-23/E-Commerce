package com.Fptu.eCommerce.module.admin.mapping;

import com.Fptu.eCommerce.module.admin.dto.AdminRequestDto;
import com.Fptu.eCommerce.module.admin.dto.AdminResponseDto;
import com.Fptu.eCommerce.module.admin.entity.AdminEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AdminMapper {
    AdminResponseDto toDTO(AdminEntity entity);

    AdminEntity toEntity(AdminResponseDto dto);

    AdminEntity toEntity(AdminRequestDto dto);

    List<AdminResponseDto> toDTOList(List<AdminEntity> entities);
}
