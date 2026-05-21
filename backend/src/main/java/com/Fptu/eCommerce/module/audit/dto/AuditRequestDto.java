package com.Fptu.eCommerce.module.audit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuditRequestDto {
    private Long actorId;
    private String actorType;
    private String action;
    private String targetType;
    private Long targetId;
    private String metadata;
    private String ipAddress;
    private String userAgent;
}
