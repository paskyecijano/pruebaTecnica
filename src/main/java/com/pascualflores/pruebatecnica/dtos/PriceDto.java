package com.pascualflores.pruebatecnica.dtos;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PriceDto {

    @JsonProperty("product_id")
    private Long product;
    @JsonProperty("brand_id")
    private Long brand;
    @JsonProperty("priceList_id")
    private Long priceList;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Double price;

}
