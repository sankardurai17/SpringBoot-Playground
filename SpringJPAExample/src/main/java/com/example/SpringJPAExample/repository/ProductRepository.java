package com.example.SpringJPAExample.repository;

import com.example.SpringJPAExample.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

//Repository interface should extends JpaRepository class
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("Select p from Product p where p.prodName =:prodName ")
    List<Product> getProductByProdName(String prodName);
}
