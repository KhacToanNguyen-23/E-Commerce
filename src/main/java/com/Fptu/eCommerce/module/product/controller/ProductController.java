package com.Fptu.eCommerce.module.product.controller;

import com.Fptu.eCommerce.module.product.dto.ProductDto;
import com.Fptu.eCommerce.module.product.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private ProductService productService;


    @GetMapping("/search")
    public List<ProductDto> findByName(@RequestParam String name){
        List<ProductDto> result = productService.findByName(name);
        return null;
    }

    @PostMapping("/api/products")
    public ProductDto create(@RequestBody ProductDto productDto){
        return null;
    }

    @PutMapping("/api/products")
    public ProductDto update(@RequestBody ProductDto productDto){
        return null;
    }

    @DeleteMapping("/api/products")
    public void delete(@RequestBody ProductDto productDto){

    }


}
