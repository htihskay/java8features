package com.example.demo;

import java.util.Arrays;
import java.util.Random;

public class Parallelsort {


	static void display(int a[]) {
      for(int i : a) {
    	System.out.print(i+" ");
    }
    System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int a[]=new int[n];
		int b[]=new int[n];
		
		Random ran=new Random();
		
		for(int i=0;i<n;i++) {
			a[i]=b[i]=ran.nextInt();
		
		}
		long startTime = System.nanoTime(); 
		  
        // Performing Serial Sort 
        Arrays.sort(a); 

        long endTime = System.nanoTime(); 
        
       //System.out.println(endTime-startTime);
        System.out.println("Normal sort timings="+(endTime-startTime)/1000000+" million nanoseconds");

        
       display(a);
        
        System.out.println("***********************************************************");
        
        startTime = System.nanoTime();
        
        Arrays.parallelSort(b);
        
        endTime = System.nanoTime(); 
        
        System.out.println("Normal Parallel sort timings="+(endTime-startTime)/1000000+" million nanoseconds");

        
        display(b);
	}

}
