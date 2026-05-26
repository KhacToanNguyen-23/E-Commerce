package com.Fptu.eCommerce.module.product.repository;

import com.Fptu.eCommerce.module.product.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<ProductEntity,Integer> {
    List<ProductEntity> findByName(String name);
    void deleteById(Long id);
}
