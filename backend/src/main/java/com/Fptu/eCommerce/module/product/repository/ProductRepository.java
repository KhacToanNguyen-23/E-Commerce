package com.Fptu.eCommerce.module.product.repository;

import com.Fptu.eCommerce.module.product.entity.ProductEntity;
import com.Fptu.eCommerce.module.user.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<ProductEntity,Integer> {
    List<ProductEntity> findByProductName(String name);
    void deleteById(Long id);
}
