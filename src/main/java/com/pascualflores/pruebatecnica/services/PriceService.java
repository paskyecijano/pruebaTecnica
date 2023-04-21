package com.pascualflores.pruebatecnica.services;

import com.pascualflores.pruebatecnica.dtos.PriceDto;
import java.time.LocalDateTime;

public interface  PriceService {

    PriceDto getPrice(LocalDateTime date, Long productId, Long brandId);

}
