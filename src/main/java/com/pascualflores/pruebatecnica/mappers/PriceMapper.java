package com.pascualflores.pruebatecnica.mappers;


import com.pascualflores.pruebatecnica.dtos.PriceDto;
import com.pascualflores.pruebatecnica.entities.Price;
import org.springframework.stereotype.Component;

@Component
public class PriceMapper {

    public PriceDto toOutputDto(Price in) {
        return PriceDto.builder()
                .priceList(in.getPriceList().getId())
                .brand(in.getBrand().getId())
                .product(in.getProduct().getId())
                .startDate(in.getStartDate())
                .endDate(in.getEndDate())
                .price(in.getPrice())
                .build();
    }

}
