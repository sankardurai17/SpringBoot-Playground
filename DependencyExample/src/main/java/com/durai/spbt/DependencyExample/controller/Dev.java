package com.durai.spbt.DependencyExample.controller;


/*Inorder to make this class eligible for object creation in the IoC container use @component annotation*/

import com.durai.spbt.DependencyExample.service.Laptop;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    private Laptop laptop;
    //3 ways of Dependency Injection

    /*1. Constructor Injection*/
    public Dev(Laptop laptop) {
        this.laptop = laptop;
    }


    public void code(){
    System.out.println("Developer is coding");
        laptop.compile();
    }

}
