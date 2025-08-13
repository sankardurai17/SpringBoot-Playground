package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        /*Inorder to create a spring container we need ApplicationContext type. For that we have to add spring-context
        * dependency in maven pom.xml.
        * */
        System.out.println("Inside App Class");
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        Dev dev=applicationContext.getBean(Dev.class);
        dev.code();


    }
}
