package com.Fptu.eCommerce.module.media.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MediaResponseDto {
    private Long id;
    private String ownerType;
    private Long ownerId;
    private String fileName;
    private String fileUrl;
    private String fileType;
    private Long fileSize;
    private Boolean isPrimary;
    private String altText;
    private LocalDateTime createdAt;
}
