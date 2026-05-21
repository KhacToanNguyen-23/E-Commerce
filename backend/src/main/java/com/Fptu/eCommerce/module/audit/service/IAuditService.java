package com.Fptu.eCommerce.module.audit.service;

import com.Fptu.eCommerce.module.audit.dto.AuditRequestDto;
import com.Fptu.eCommerce.module.audit.dto.AuditResponseDto;
import java.util.List;

public interface IAuditService {
    List<AuditResponseDto> getAll();

    AuditResponseDto getById(Long id);

    AuditResponseDto create(AuditRequestDto requestDto);

    AuditResponseDto update(Long id, AuditRequestDto requestDto);

    void delete(Long id);
}
