package com.example.demo;

import java.util.function.Predicate;

public class Predicattt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it is a functional interface
		//p1 is reference to the predicate
		
		Predicate<Integer> p1= i -> i%2==0;
		
		System.out.println(p1.test(10));
		System.out.println(p1.test(11));
		
		//checking whether length of string is greater than 5 or not
		
		//to check length
		Predicate<String> len= str -> str.length() >5 ;
		
		//Even or odd
		Predicate<String> of= str -> str.length()%2==0 ;
		
		System.out.println("len >5");
		System.out.println(len.test("yoyo"));
		System.out.println(len.test("workspace"));
		
		System.out.println("len > 5 and len %2==0");
		System.out.println(len.and(of).test("123456"));
		System.out.println(len.and(of).test("1234567"));
		
		System.out.println("OR");
		System.out.println(len.or(of).test("12"));
		
		
	}

}
