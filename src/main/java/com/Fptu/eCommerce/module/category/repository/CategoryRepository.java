package com.Fptu.eCommerce.module.category.repository;

import com.Fptu.eCommerce.module.category.dto.CategoryResponseDto;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<CategoryResponseDto, Long> {
}
