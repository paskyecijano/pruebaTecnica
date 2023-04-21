package com.pascualflores.pruebatecnica.controllers;

import com.pascualflores.pruebatecnica.dtos.PriceDto;
import com.pascualflores.pruebatecnica.services.PriceService;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/price")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<PriceDto> pedidosTotales(@PathVariable("date") @DateTimeFormat(pattern="yyyy-MM-dd-HH:mm:ss") LocalDateTime date, @PathVariable("productId") Long productId, @PathVariable("brandId") Long brandId){
        PriceDto response = this.priceService.getPrice(date, productId, brandId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
