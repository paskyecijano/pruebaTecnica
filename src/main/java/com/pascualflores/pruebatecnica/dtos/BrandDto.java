package com.pascualflores.pruebatecnica.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BrandDto {

    private Long id;
    private String name;

}
