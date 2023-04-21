package com.pascualflores.pruebatecnica.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PriceListDto {

    private Long id;
    private String name;

}
