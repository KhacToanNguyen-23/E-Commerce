package com.Fptu.eCommerce.module.media.service;

import com.Fptu.eCommerce.module.media.dto.MediaRequestDto;
import com.Fptu.eCommerce.module.media.dto.MediaResponseDto;
import java.util.List;

public interface IMediaService {
    List<MediaResponseDto> getAll();

    MediaResponseDto getById(Long id);

    MediaResponseDto create(MediaRequestDto requestDto);

    MediaResponseDto update(Long id, MediaRequestDto requestDto);

    void delete(Long id);
}
