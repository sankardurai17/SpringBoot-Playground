package com.durai.spbt.DependencyExample.controller;


/*Inorder to make this class eligible for object creation in the IoC container use @component annotation*/

import com.durai.spbt.DependencyExample.service.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    //private Laptop laptop;
    //3 ways of Dependency Injection

    /*1. Constructor Injection*/
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }

    /*2. Setter Injection using @autowired
    Auto wire is used to connect Dev to Laptop class basically it connects the reference
    * */
//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }


    //Field Injection using @Autowired but not recommended in standard practice
    @Autowired
    private Laptop laptop;

    public void code(){
    System.out.println("Developer is coding");
        laptop.compile();
    }

}
