package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

interface A{
	 void show();
	default void imp() {
		 System.out.println("Implemented inside the interface");
	 }
	static void fun() {
		System.out.println("Defined function using static");
	}
}
class B implements A{
	public void show() {
		System.out.println("Hey this is implementation");
	}
}

@SpringBootApplication
public class FirstspringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(FirstspringApplication.class, args);
		B o=new B();
		o.show();
		o.imp();
		A.fun();
	
		
	}

}
