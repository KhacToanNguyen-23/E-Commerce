package com.Fptu.eCommerce.module.notification.service.imp;

import com.Fptu.eCommerce.module.notification.dto.NotificationRequestDto;
import com.Fptu.eCommerce.module.notification.dto.NotificationResponseDto;
import com.Fptu.eCommerce.module.notification.service.INotificationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService implements INotificationService {
    @Override
    public List<NotificationResponseDto> getAll() {
        return List.of();
    }

    @Override
    public NotificationResponseDto getById(Long id) {
        return null;
    }

    @Override
    public NotificationResponseDto create(NotificationRequestDto requestDto) {
        return null;
    }

    @Override
    public NotificationResponseDto update(Long id, NotificationRequestDto requestDto) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }
}
