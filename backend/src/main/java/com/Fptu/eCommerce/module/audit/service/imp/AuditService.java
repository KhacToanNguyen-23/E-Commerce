package com.Fptu.eCommerce.module.audit.service.imp;

import com.Fptu.eCommerce.module.audit.dto.AuditRequestDto;
import com.Fptu.eCommerce.module.audit.dto.AuditResponseDto;
import com.Fptu.eCommerce.module.audit.service.IAuditService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditService implements IAuditService {
    @Override
    public List<AuditResponseDto> getAll() {
        return List.of();
    }

    @Override
    public AuditResponseDto getById(Long id) {
        return null;
    }

    @Override
    public AuditResponseDto create(AuditRequestDto requestDto) {
        return null;
    }

    @Override
    public AuditResponseDto update(Long id, AuditRequestDto requestDto) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }
}
