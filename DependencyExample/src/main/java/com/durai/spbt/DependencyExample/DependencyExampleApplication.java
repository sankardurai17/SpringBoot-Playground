package com.durai.spbt.DependencyExample;

import com.durai.spbt.DependencyExample.controller.Dev;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyExampleApplication {

	public static void main(String[] args) {
	/* This line creates the spring container and it is the stRt point of spring application
	* */
		//SpringApplication.run(DependencyExampleApplication.class, args);


		/*
		* Inorder to get the IoC container reference catch it with ApplicationContext type since this run method returns
		* applicationcontext type
		* */


		ApplicationContext applicationContext=SpringApplication.run(DependencyExampleApplication.class, args);

		System.out.println("Spring Boot Application Started");

		/*Traditional way of creating a object for a class. It works but creating and maintaing objects for 1000's
		* of classes in a project is complicated*/
		//Dev dev=new Dev();

		/* Solution: Spring framework offers dependency management capabilities where it maintains the objects in their
		spring container inside JVM
		* */

		Dev dev=applicationContext.getBean(Dev.class);
		dev.code();

	}

}
