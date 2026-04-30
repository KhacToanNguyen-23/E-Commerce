package com.Fptu.eCommerce.module.category.controller;

import com.Fptu.eCommerce.module.category.dto.CategoryDto;
import com.Fptu.eCommerce.module.category.service.CategoryService;
import com.Fptu.eCommerce.module.product.dto.ProductDto;
import com.Fptu.eCommerce.module.product.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CategoryController {
    private CategoryService categoryService;


    @GetMapping("/search")
    public List<CategoryDto> findByName(@RequestParam String name){
        List<ProductDto> result = categoryService.findByName(name);
        return null;
    }

    @PostMapping("/api/category")
    public CategoryDto create(@RequestBody CategoryDto categoryDto){
        return null;
    }

    @PutMapping("/api/category")
    public CategoryDto update(@RequestBody CategoryDto categoryDto){
        return null;
    }

    @DeleteMapping("/api/category")
    public void delete(@RequestBody CategoryDto categoryDto){

    }

}
