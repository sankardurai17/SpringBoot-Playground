package com.example.myDemoApp.controller;

import com.example.myDemoApp.model.Product;
import com.example.myDemoApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;
    @Autowired
    public void setService(ProductService productService) {
       this.productService = productService;
    }
    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }
}
