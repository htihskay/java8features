package com.example.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class IOimprovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Stream<Path> list= Files.list(Paths.get("."));
			
			list.forEach(System.out :: println);
			
			System.out.println("***************************************************");
			
			Stream<Path> src= Files.list(Paths.get("src/main/java/com/example/demo"));
			
			src.forEach(System.out :: println);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
