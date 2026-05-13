package com.Fptu.eCommerce.module.category.service;



import com.Fptu.eCommerce.module.category.dto.CategoryRequestDto;
import com.Fptu.eCommerce.module.category.dto.CategoryResponseDto;

import java.util.List;

public interface ICategoryService {
    List<CategoryResponseDto> getAllProducts();


    CategoryResponseDto getProductById(Long id);


    CategoryResponseDto createProduct(CategoryRequestDto productRequestDto);


    CategoryResponseDto updateProduct(Long id, CategoryRequestDto productRequestDto);


    void deleteProduct(Long id);

    List<CategoryResponseDto> searchProductsByName(String name);
}
