package com.example.SpringJPAExample.service;



import com.example.SpringJPAExample.model.Product;
import com.example.SpringJPAExample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    /*private List<Product> products = new ArrayList<>(Arrays.asList(new Product(100, "iPhone", 2000),
            new Product(101, "Camera", 1200),
            new Product(102, "headPhones", 2200)));*/


    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProductByID(int id) {
        return productRepository.findById(id).orElse(new Product(0,"No Product Found",0));
    }

    public String addProducts(Product product) {
        System.out.println(product);
        productRepository.save(product);
        return "Product added successfully";
    }

    public String updateProduct(Product product) {
       productRepository.save(product);
        return "Product updated successfully";
    }

    public String deleteProduct(int prodId) {
       productRepository.deleteById(prodId);
        return "Product deleted successfully";
    }
}
