package com.Fptu.eCommerce.module.media.service.imp;

import com.Fptu.eCommerce.module.media.dto.MediaRequestDto;
import com.Fptu.eCommerce.module.media.dto.MediaResponseDto;
import com.Fptu.eCommerce.module.media.service.IMediaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaService implements IMediaService {
    @Override
    public List<MediaResponseDto> getAll() {
        return List.of();
    }

    @Override
    public MediaResponseDto getById(Long id) {
        return null;
    }

    @Override
    public MediaResponseDto create(MediaRequestDto requestDto) {
        return null;
    }

    @Override
    public MediaResponseDto update(Long id, MediaRequestDto requestDto) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }
}
