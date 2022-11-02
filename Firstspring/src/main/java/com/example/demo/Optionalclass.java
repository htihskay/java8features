package com.example.demo;

import java.util.Optional;

public class Optionalclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			String[] str = new String[10];  
//		  
//	        String lowercaseString = str[5].toLowerCase();  
//	        System.out.print(lowercaseString);  
	        
			
		
	        String[] str = new String[10];  
	        //str[5] ="Im here";
	        Optional<String> checkNull = Optional.ofNullable(str[5]);  
	        
	        System.out.println("Values present or not="+checkNull.isPresent());
	        System.out.println("Values present or not="+checkNull.isEmpty());
	        
	        if(checkNull.isPresent()){  // check for value is present or not  
	            String lowercaseString = str[5].toLowerCase();  
	            System.out.print(lowercaseString);  
	        }else  
	            System.out.println("string value is not present");  
	        	//System.out.println(checkNull.get());
	        
	        	//checkNull.orElse("But I made string for you");
	        System.out.println(checkNull.orElse("But I made string for you"));
	        	
	    }  
	        
	        
	

}
