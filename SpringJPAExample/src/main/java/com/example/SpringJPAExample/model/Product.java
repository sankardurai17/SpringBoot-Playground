package com.example.SpringJPAExample.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="product")
public class Product {

    @Id
    @Column(name="prodId")
    private int prodId;

    @Column(name="prodName")
    private String prodName;

    @Column(name="prodPrice")
    private int prodPrice;
}
