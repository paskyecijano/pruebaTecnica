package com.pascualflores.pruebatecnica.services.impl;

import com.pascualflores.pruebatecnica.dtos.PriceDto;
import com.pascualflores.pruebatecnica.mappers.PriceMapper;
import com.pascualflores.pruebatecnica.repositories.PriceRepository;
import com.pascualflores.pruebatecnica.services.PriceService;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    private PriceRepository priceRepository;

    @Autowired
    private PriceMapper priceMapper;

    @Override
    public PriceDto getPrice(LocalDateTime date, Long productId, Long brandId) {
//        return this.priceMapper.toDto(this.priceRepository.getPrice(date, productId, brandId));
        return null;
    }

}
