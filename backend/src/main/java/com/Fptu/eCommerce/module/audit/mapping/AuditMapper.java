package com.Fptu.eCommerce.module.audit.mapping;

import com.Fptu.eCommerce.module.audit.dto.AuditRequestDto;
import com.Fptu.eCommerce.module.audit.dto.AuditResponseDto;
import com.Fptu.eCommerce.module.audit.entity.AuditEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuditMapper {
    AuditResponseDto toDTO(AuditEntity entity);

    AuditEntity toEntity(AuditResponseDto dto);

    AuditEntity toEntity(AuditRequestDto dto);

    List<AuditResponseDto> toDTOList(List<AuditEntity> entities);
}
