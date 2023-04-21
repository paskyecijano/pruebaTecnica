package com.pascualflores.pruebatecnica.dtos;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PriceDto {

    private Long id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Integer priority;
    private Double price;
    private String curr;

    private PriceListDto priceList;
    private BrandDto brand;
    private ProductDto product;
}
