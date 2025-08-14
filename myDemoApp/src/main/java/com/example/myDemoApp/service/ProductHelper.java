
package com.example.myDemoApp.service;

import com.example.myDemoApp.model.Product;
import lombok.experimental.Helper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductHelper {
    public int getProductIndex(List<Product> products,int prodID){
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId()==prodID){
                return i;
            }
        }
        return -1;
    }
}

