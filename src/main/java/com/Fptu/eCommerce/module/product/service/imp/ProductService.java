package com.Fptu.eCommerce.module.product.service.imp;

import com.Fptu.eCommerce.module.product.dto.ProductRequestDto;
import com.Fptu.eCommerce.module.product.dto.ProductResponseDto;
import com.Fptu.eCommerce.module.product.entity.ProductEntity;
import com.Fptu.eCommerce.module.product.mapping.ProductMapper;
import com.Fptu.eCommerce.module.product.repository.ProductRepository;
import com.Fptu.eCommerce.module.product.service.IProductService;
import com.Fptu.eCommerce.module.user.entity.UserEntity;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductMapper productMapper;
    private ProductResponseDto productResponseDto;



    @Override
    public List<ProductResponseDto> getAllProducts() {
        return List.of();
    }

    @Override
    public ProductResponseDto getProductById(Long id) {
        return null;
    }

    @Override
    public ProductResponseDto createProduct(ProductRequestDto productRequestDto) {
        return null;
    }

    @Override
    public ProductResponseDto updateProduct(Long id, ProductRequestDto productRequestDto) {
        return null;
    }


    @Transactional
    @Override
    public void deleteProduct(Long id) {
        if(!productRepository.existsById(Math.toIntExact(id))){
            throw new RuntimeException("User not found with id: " + id);
        }
        productRepository.deleteById(id);
    }

    @Override
    public List<ProductResponseDto> searchProductsByName(String name) {
        List<ProductEntity> entities = productRepository.findByProductName(name);
        return productMapper.toDTOList(entities);
    }
}
