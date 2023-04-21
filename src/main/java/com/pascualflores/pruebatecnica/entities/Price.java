package com.pascualflores.pruebatecnica.entities;


import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "prices")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="start_date", nullable = false)
    private LocalDateTime startDate;

    @Column(name="end_date", nullable = false)
    private LocalDateTime endDate;

    @Column(nullable = false)
    private Integer priority;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private String curr;

    @ManyToOne
    @JoinColumn(name = "price_list_id")
    private PriceList priceList;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
