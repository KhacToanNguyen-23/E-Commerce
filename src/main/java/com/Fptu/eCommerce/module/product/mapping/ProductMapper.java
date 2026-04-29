package com.Fptu.eCommerce.module.product.mapping;

import com.Fptu.eCommerce.module.product.dto.ProductDto;
import com.Fptu.eCommerce.module.product.entity.ProductEntity;

import java.util.ArrayList;
import java.util.List;

public class ProductMapper {
    public List<ProductDto> toDTOlist(List<ProductEntity> entities) {
        List<ProductDto> result = new ArrayList<>();
        for (ProductEntity entity : entities) {
            ProductDto productDto = new ProductDto();


        }

        return result;
    }
}
