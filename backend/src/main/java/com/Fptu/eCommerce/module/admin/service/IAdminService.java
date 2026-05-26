package com.Fptu.eCommerce.module.admin.service;

import com.Fptu.eCommerce.module.admin.dto.AdminRequestDto;
import com.Fptu.eCommerce.module.admin.dto.AdminResponseDto;
import java.util.List;

public interface IAdminService {
    List<AdminResponseDto> getAll();

    AdminResponseDto getById(Long id);

    AdminResponseDto create(AdminRequestDto requestDto);

    AdminResponseDto update(Long id, AdminRequestDto requestDto);

    void delete(Long id);
}
