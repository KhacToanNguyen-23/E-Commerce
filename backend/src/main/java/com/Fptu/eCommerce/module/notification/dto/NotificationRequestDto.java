package com.Fptu.eCommerce.module.notification.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationRequestDto {
    private Long userId;
    private String type;
    private String channel;
    private String title;
    private String message;
}
