package org.example;

public class Desktop implements Computer{
    public Desktop() {
        System.out.println("Desktop created");
    }
    public void compile(){
        System.out.println("Compiling inside Desktop..");
    }
}
