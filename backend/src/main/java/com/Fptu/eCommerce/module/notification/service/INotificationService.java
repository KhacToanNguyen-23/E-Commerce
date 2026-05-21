package com.Fptu.eCommerce.module.notification.service;

import com.Fptu.eCommerce.module.notification.dto.NotificationRequestDto;
import com.Fptu.eCommerce.module.notification.dto.NotificationResponseDto;
import java.util.List;

public interface INotificationService {
    List<NotificationResponseDto> getAll();

    NotificationResponseDto getById(Long id);

    NotificationResponseDto create(NotificationRequestDto requestDto);

    NotificationResponseDto update(Long id, NotificationRequestDto requestDto);

    void delete(Long id);
}
