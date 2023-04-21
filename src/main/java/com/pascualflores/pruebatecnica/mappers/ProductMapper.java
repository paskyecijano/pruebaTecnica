package com.pascualflores.pruebatecnica.mappers;

import com.pascualflores.pruebatecnica.dtos.BrandDto;
import com.pascualflores.pruebatecnica.dtos.ProductDto;
import com.pascualflores.pruebatecnica.entities.Brand;
import com.pascualflores.pruebatecnica.entities.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toEntity(ProductDto in) {
        return Product.builder()
                .id(in.getId())
                .name(in.getName())
                .build();
    }

    public ProductDto toDto(Product in) {
        return ProductDto.builder()
                .id(in.getId())
                .name(in.getName())
                .build();
    }
}
