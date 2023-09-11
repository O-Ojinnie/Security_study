package com.springboot.security.service;

import com.springboot.security.data.dto.ProductDto;
import com.springboot.security.data.dto.ProductResponseDto;

public interface ProductService {
    public ProductResponseDto getProduct(Long number);
    public ProductResponseDto saveProduct(ProductDto productDto);
    public ProductResponseDto changeProductName(Long number, String name)throws Exception;
    public void deleteProduct(Long number) throws Exception;
}
