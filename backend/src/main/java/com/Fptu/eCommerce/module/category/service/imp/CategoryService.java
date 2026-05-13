package com.Fptu.eCommerce.module.category.service.imp;

import com.Fptu.eCommerce.module.category.dto.CategoryRequestDto;
import com.Fptu.eCommerce.module.category.dto.CategoryResponseDto;
import com.Fptu.eCommerce.module.category.service.ICategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Override
    public List<CategoryResponseDto> getAllProducts() {
        return List.of();
    }

    @Override
    public CategoryResponseDto getProductById(Long id) {
        return null;
    }

    @Override
    public CategoryResponseDto createProduct(CategoryRequestDto productRequestDto) {
        return null;
    }

    @Override
    public CategoryResponseDto updateProduct(Long id, CategoryRequestDto productRequestDto) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }

    @Override
    public List<CategoryResponseDto> searchProductsByName(String name) {
        return List.of();
    }
}
