package com.Fptu.eCommerce.module.wishlist.service;

import com.Fptu.eCommerce.module.wishlist.dto.WishlistRequestDto;
import com.Fptu.eCommerce.module.wishlist.dto.WishlistResponseDto;
import java.util.List;

public interface IWishlistService {
    List<WishlistResponseDto> getAll();

    WishlistResponseDto getById(Long id);

    WishlistResponseDto create(WishlistRequestDto requestDto);

    WishlistResponseDto update(Long id, WishlistRequestDto requestDto);

    void delete(Long id);
}
