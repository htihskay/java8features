package com.example.demo;

//class Threadd implements Runnable{
//	public void run() {
//		for(int i=0;i<5;i++) {
//			System.out.println("Another class");
//		}
//		}
//}

interface Do{
	void x();
	void z();
	default void defi() {
		System.out.println("Function defined inside interface using default keyword");
	}
	
	static void defi2() {
		System.out.println("Static method inside interface");
	}
}

public class Mulitthreadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Threadd ob=new Threadd();
//		Thread t=new Thread(ob);
//		t.start();		
		
		
		//Runnable is a functional interface so we can use lambda expression
		
//		Runnable ob=()-> {
//			for(int i=0;i<5;i++) {
//				System.out.println("Lambda Another");
//			}
//		};
//		
//		Thread t=new Thread(ob);
//		t.start();
		

//		Runnable ob=new Runnable() {
//			public void run() {
//				for(int i=0;i<5;i++) {
//					System.out.println("Inner Anonymous Class");
//				}
//			}
//		};
//		
//		Thread t=new Thread(ob);
//		t.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("Main Class");
		}
		
		
		
//		Do ob1=new Do() {
//			public void x() {
//				System.out.println("X is defined inside innerclass");
//			}
//			public void z() {
//				System.out.println("X is defined inside innerclass");
//			}
//		};
//		
//		ob1.z();
//		ob1.x();
//		ob1.defi();
		
//		Do.defi2();
		
	}
	
	
	
		
	

}
