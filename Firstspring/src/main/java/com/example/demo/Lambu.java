package com.example.demo;

//functional interface must have only one
//abstract method and can have any number of default and
//static method
@FunctionalInterface
interface A1 {
	void show();
	
}
@FunctionalInterface
interface B2{
	 void add(int a, int b);
}
@FunctionalInterface
interface C2{
	int square(int n);
}


//class B1 implements A1 {
//	public void show() {
//		System.out.println("Hey I have implemented function here");
//	}
//}

public class Lambu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	new B().show();
	
		//anonymous inner class
//		A obj=new A() {
//			public void show() {
//				System.out.println("Inner class function");
//			}
//		};
//		obj.show();
		
//		A obj=() -> {
//			System.out.println("Reduced using lambda expression");
//		};
//		obj.show();
//	}
		
		A1 i=() -> System.out.println("show defined using lambda expression");
		i.show();
		
		B2 t=(a,b) -> System.out.println(a+b);
		
		t.add(7, 3);
		
		B2 t2=(a,b) ->
		{
			System.out.println("Multiple statements");
			System.out.println(a);
			System.out.println(b);
			System.out.println(a+b);
						
		};
		t2.add(4, 1);
		
		
		//functional interface with return value
		System.out.println("functional interface with return value");
		C2 q=n -> { return n*n ; };
		 System.out.println(q.square(5)); 
		
	}
}
