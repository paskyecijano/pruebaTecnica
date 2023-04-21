package com.pascualflores.pruebatecnica.mappers;

import com.pascualflores.pruebatecnica.dtos.PriceDto;
import com.pascualflores.pruebatecnica.dtos.PriceListDto;
import com.pascualflores.pruebatecnica.entities.Price;
import com.pascualflores.pruebatecnica.entities.PriceList;
import org.springframework.stereotype.Component;

@Component
public class PriceListMapper {

    public PriceList toEntity(PriceListDto in) {
        return PriceList.builder()
                .id(in.getId())
                .name(in.getName())
                .build();
    }

    public PriceListDto toDto(PriceList in) {
        return PriceListDto.builder()
                .id(in.getId())
                .name(in.getName())
                .build();
    }
}
