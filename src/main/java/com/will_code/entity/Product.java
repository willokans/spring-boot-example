package com.will_code.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PRODUCT_TBL")
public class Product {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer quantity;
    private Double price;

}
