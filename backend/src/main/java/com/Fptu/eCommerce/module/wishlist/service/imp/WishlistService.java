package com.Fptu.eCommerce.module.wishlist.service.imp;

import com.Fptu.eCommerce.module.wishlist.dto.WishlistRequestDto;
import com.Fptu.eCommerce.module.wishlist.dto.WishlistResponseDto;
import com.Fptu.eCommerce.module.wishlist.service.IWishlistService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishlistService implements IWishlistService {
    @Override
    public List<WishlistResponseDto> getAll() {
        return List.of();
    }

    @Override
    public WishlistResponseDto getById(Long id) {
        return null;
    }

    @Override
    public WishlistResponseDto create(WishlistRequestDto requestDto) {
        return null;
    }

    @Override
    public WishlistResponseDto update(Long id, WishlistRequestDto requestDto) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }
}
