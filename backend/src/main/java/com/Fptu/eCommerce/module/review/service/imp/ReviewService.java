package com.Fptu.eCommerce.module.review.service.imp;

import com.Fptu.eCommerce.module.review.dto.ReviewRequestDto;
import com.Fptu.eCommerce.module.review.dto.ReviewResponseDto;
import com.Fptu.eCommerce.module.review.service.IReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService implements IReviewService {
    @Override
    public List<ReviewResponseDto> getAll() {
        return List.of();
    }

    @Override
    public ReviewResponseDto getById(Long id) {
        return null;
    }

    @Override
    public ReviewResponseDto create(ReviewRequestDto requestDto) {
        return null;
    }

    @Override
    public ReviewResponseDto update(Long id, ReviewRequestDto requestDto) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }
}
