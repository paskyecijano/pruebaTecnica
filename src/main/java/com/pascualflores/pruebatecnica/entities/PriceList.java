package com.pascualflores.pruebatecnica.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "price_list")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PriceList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "priceList", fetch= FetchType.LAZY)
    private List<Price> prices;

}
