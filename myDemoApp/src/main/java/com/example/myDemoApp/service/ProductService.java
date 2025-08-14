package com.example.myDemoApp.service;


import com.example.myDemoApp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductHelper helper;

    private List<Product> products = new ArrayList<>(Arrays.asList(new Product(100, "iPhone", 2000),
            new Product(101, "Camera", 1200),
            new Product(102, "headPhones", 2200)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductByID(int id) {
        return products.stream().filter(product -> product.getProdId() == id).findFirst().orElse(new Product(0, "Not Found", 0));
    }

    public String addProducts(Product product) {
        products.add(product);
        return "Product added successfully";
    }

    public String updateProduct(Product product) {
        int index = helper.getProductIndex(products,product.getProdId());
        System.out.println(index);
        if(index == -1){
            return "Product not found";
        }
        products.set(index, product);
        return "Product updated successfully";
    }

    public String deleteProduct(int prodId) {
        int index = helper.getProductIndex(products,prodId);
        System.out.println(index);
        if(index == -1){
            return "Product not found";
        }
        products.remove(index);
        return "Product deleted successfully";
    }
}
