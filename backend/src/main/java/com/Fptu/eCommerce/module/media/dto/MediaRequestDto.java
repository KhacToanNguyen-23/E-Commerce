package com.Fptu.eCommerce.module.media.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MediaRequestDto {
    private String ownerType;
    private Long ownerId;
    private String fileName;
    private String fileUrl;
    private String fileType;
    private Long fileSize;
    private Boolean isPrimary;
    private String altText;
}
