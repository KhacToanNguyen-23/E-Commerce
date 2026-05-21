package com.Fptu.eCommerce.module.admin.service.imp;

import com.Fptu.eCommerce.module.admin.dto.AdminRequestDto;
import com.Fptu.eCommerce.module.admin.dto.AdminResponseDto;
import com.Fptu.eCommerce.module.admin.service.IAdminService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService implements IAdminService {
    @Override
    public List<AdminResponseDto> getAll() {
        return List.of();
    }

    @Override
    public AdminResponseDto getById(Long id) {
        return null;
    }

    @Override
    public AdminResponseDto create(AdminRequestDto requestDto) {
        return null;
    }

    @Override
    public AdminResponseDto update(Long id, AdminRequestDto requestDto) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }
}
