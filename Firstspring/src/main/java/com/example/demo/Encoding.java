package com.example.demo;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
public class Encoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="How are you ?";
		
		try {
			String  encoded=Base64.getEncoder().encodeToString(str.getBytes("UTF-8"));
			
			System.out.println(encoded);
			
			byte[] decoded=Base64.getDecoder().decode(encoded);
			
			String finall=new String(decoded,"UTF-8");
			
			System.out.println(finall);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
