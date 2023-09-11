package com.springboot.security.data.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductResponseDto {
    private Long number;
    private String name;
    private int price;
    private int stock;
}
