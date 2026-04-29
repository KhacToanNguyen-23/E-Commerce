package com.Fptu.eCommerce.module.product.service;

import com.Fptu.eCommerce.module.product.dto.ProductDto;
import com.Fptu.eCommerce.module.product.entity.ProductEntity;
import com.Fptu.eCommerce.module.product.mapping.ProductMapper;
import com.Fptu.eCommerce.module.product.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private ProductRepository productRepository;;
    private ProductMapper productMapper;


    public List<ProductDto> findByName(String name) {
        List<ProductDto> result  = new ArrayList<>();
        List<ProductEntity> entities = productRepository.findByName(name);
        return result = productMapper.toDTOlist(entities);
    }
}
