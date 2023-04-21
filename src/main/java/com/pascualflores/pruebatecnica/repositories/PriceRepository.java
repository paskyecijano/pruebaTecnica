package com.pascualflores.pruebatecnica.repositories;

import com.pascualflores.pruebatecnica.entities.Price;
import java.time.LocalDateTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

    @Query(value = "Select * from prices where start_date < :date and end_date > :date and product_id = :productId and brand_id = :brandId", nativeQuery = true)
    Price getPrice(@Param("date") LocalDateTime date, @Param("productId") Long productId, @Param("brandId") Long brandId);

}
