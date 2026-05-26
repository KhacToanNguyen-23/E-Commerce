package com.Fptu.eCommerce.module.audit.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "audit")
public class AuditEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
