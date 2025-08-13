package com.durai.spbt.DependencyExample.service;

import org.springframework.stereotype.Component;

/*Inorder to make this class eligible for object creation in the IoC container use @component annotation*/
@Component
public class Laptop implements Computer{
    public void compile(){
        System.out.println("Compiling in Laptop");
    }
}
