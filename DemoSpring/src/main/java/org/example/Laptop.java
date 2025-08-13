package org.example;

public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop created");
    }
    public void compile(){
        System.out.println("Compiling inside Laptop..");
    }
}
