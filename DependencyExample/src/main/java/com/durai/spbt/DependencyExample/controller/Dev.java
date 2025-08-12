package com.durai.spbt.DependencyExample.controller;


/*Inorder to make this class eligible for object creation in the IoC container use @component annotation*/

import org.springframework.stereotype.Component;

@Component
public class Dev {


    public void code(){
    System.out.println("Developer is coding");
    }

}
