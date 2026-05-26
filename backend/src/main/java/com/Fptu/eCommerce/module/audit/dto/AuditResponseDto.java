package com.Fptu.eCommerce.module.audit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuditResponseDto {
    private Long id;
    private Long actorId;
    private String actorType;
    private String action;
    private String targetType;
    private Long targetId;
    private String metadata;
    private String ipAddress;
    private String userAgent;
    private LocalDateTime createdAt;
}
