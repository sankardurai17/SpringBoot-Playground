package com.example.myDemoApp.service;


import com.example.myDemoApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products=new ArrayList<>(Arrays.asList(new Product(100,"iPhone",2000),
            new Product(101,"Camera",1200), new Product(102,"headPhones",2200)));

    public List<Product> getProducts(){
      return products;
  }
}
