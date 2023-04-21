package com.pascualflores.pruebatecnica.mappers;


import com.pascualflores.pruebatecnica.dtos.PriceDto;
import com.pascualflores.pruebatecnica.entities.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PriceMapper {

    @Autowired
    private PriceListMapper priceListMapper;

    @Autowired
    private BrandMapper brandMapper;

    @Autowired
    private ProductMapper productMapper;

    public Price toEntity(PriceDto in) {
        return Price.builder()
                .id(in.getId())
                .startDate(in.getStartDate())
                .endDate(in.getEndDate())
                .priority(in.getPriority())
                .price(in.getPrice())
                .curr(in.getCurr())
                .priceList(this.priceListMapper.toEntity(in.getPriceList()))
                .brand(this.brandMapper.toEntity(in.getBrand()))
                .product(this.productMapper.toEntity(in.getProduct()))
                .build();
    }


    public PriceDto toDto(Price in) {
        return PriceDto.builder()
                .id(in.getId())
                .startDate(in.getStartDate())
                .endDate(in.getEndDate())
                .priority(in.getPriority())
                .price(in.getPrice())
                .curr(in.getCurr())
                .priceList(this.priceListMapper.toDto(in.getPriceList()))
                .brand(this.brandMapper.toDto(in.getBrand()))
                .product(this.productMapper.toDto(in.getProduct()))
                .build();
    }
}
