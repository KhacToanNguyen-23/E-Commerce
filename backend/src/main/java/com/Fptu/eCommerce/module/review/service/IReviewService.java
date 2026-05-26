package com.Fptu.eCommerce.module.review.service;

import com.Fptu.eCommerce.module.review.dto.ReviewRequestDto;
import com.Fptu.eCommerce.module.review.dto.ReviewResponseDto;
import java.util.List;

public interface IReviewService {
    List<ReviewResponseDto> getAll();

    ReviewResponseDto getById(Long id);

    ReviewResponseDto create(ReviewRequestDto requestDto);

    ReviewResponseDto update(Long id, ReviewRequestDto requestDto);

    void delete(Long id);
}
