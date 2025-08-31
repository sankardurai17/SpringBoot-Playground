package com.example.SpringJPAExample.controller;

import com.example.SpringJPAExample.model.Product;
import com.example.SpringJPAExample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setService(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductByID(@PathVariable int prodId) {
        return productService.getProductByID(prodId);
    }

    @PostMapping("/products")
    public String addProduct(@RequestBody Product product) {
        return productService.addProducts(product);
    }

    @PutMapping("/products")
    public String updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping("/products/{prodID}")
    public String deleteProduct(@PathVariable int prodID) {
        System.out.println("Not working");
        return productService.deleteProduct(prodID);
    }


}
