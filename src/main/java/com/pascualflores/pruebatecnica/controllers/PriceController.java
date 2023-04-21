package com.pascualflores.pruebatecnica.controllers;

import com.pascualflores.pruebatecnica.dtos.PriceDto;
import com.pascualflores.pruebatecnica.services.PriceService;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(path = "/api/price")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<PriceDto> getPrice(
      @PathParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime date,
      @PathParam("productId") Long productId,
      @PathParam("brandId") Long brandId) {
        try {
            PriceDto response = this.priceService.getPrice(date, productId, brandId);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            // manejar excepción aqui
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
