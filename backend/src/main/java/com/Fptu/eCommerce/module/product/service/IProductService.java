package com.Fptu.eCommerce.module.product.service;

import com.Fptu.eCommerce.module.product.dto.ProductRequestDto;
import com.Fptu.eCommerce.module.product.dto.ProductResponseDto;

import java.util.List;

public interface IProductService {

    List<ProductResponseDto> getAllProducts();


    ProductResponseDto getProductById(Long id);


    ProductResponseDto createProduct(ProductRequestDto productRequestDto);


    ProductResponseDto updateProduct(Long id, ProductRequestDto productRequestDto);


    void deleteProduct(Long id);

    List<ProductResponseDto> searchProductsByName(String name);
}
