package org.example;

public class Dev {
    /*To use the Laptop functionalities we need to create a bean for Laptop in spring config .xml and inject the dependency
    to Dev class. It can be done as usual in three ways constructor, setter and autowire by name / by type*/
    private Laptop laptop;

    public Dev(){
        System.out.println("Dev Constructor");
    }
    /*1. Dependency Inject by Constructor*/
 /*   public Dev(Laptop laptop) {
        this.laptop = laptop;
    }*/

    //Dependency Injection by setter
    public void setLaptop(Laptop laptop){
        this.laptop = laptop;
    }

    public void code(){
        System.out.println("Developer is coding");
        laptop.compile();

    }
}
