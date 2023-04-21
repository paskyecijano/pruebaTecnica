package com.pascualflores.pruebatecnica.mappers;

import com.pascualflores.pruebatecnica.dtos.BrandDto;
import com.pascualflores.pruebatecnica.dtos.PriceListDto;
import com.pascualflores.pruebatecnica.entities.Brand;
import com.pascualflores.pruebatecnica.entities.PriceList;
import org.springframework.stereotype.Component;

@Component
public class BrandMapper {

    public Brand toEntity(BrandDto in) {
        return Brand.builder()
                .id(in.getId())
                .name(in.getName())
                .build();
    }

    public BrandDto toDto(Brand in) {
        return BrandDto.builder()
                .id(in.getId())
                .name(in.getName())
                .build();
    }
}
