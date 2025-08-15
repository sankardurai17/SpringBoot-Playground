package com.example.SpringJPAExample.repository;

import com.example.SpringJPAExample.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Repository interface should extends JpaRepository class
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
