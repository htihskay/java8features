package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class Streamapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		System.out.println(list);
		
		//external iteration
		for(int i :list) {
			System.out.print(i+", ");
		}
		System.out.println("");
		
		//internal iteration
		System.out.println("Internal iteration");
		list.forEach(i -> System.out.print(i*2+" "));
		
		
		//stream() convert collection into stream 
		//it returns referece of the stream
		//System.out.println(list.stream());
		
		Stream<Integer> data=list.stream();
		
		long len=data.count();
		System.out.println("\nLength="+len);
		
//		data.forEach(i ->System.out.println(i));
		//once stream is consumed it can not be reused again
		//gives error
		//data.forEach(i ->System.out.println(i));
		
		//sort
		
//		Stream<Integer> sort=data.sorted();
//		
//		System.out.println("Sorted stream data");
//		sort.forEach(i -> System.out.print(i+" "));
		
		
//		Stream<Integer> by10=data.map(i -> i*10);
//		
//		by10.forEach(i->System.out.print(i+ " "));
//		System.out.println();
		

		//filter by integer which are divisible by 20
//		Stream<Integer> by10=data.map(i -> i*10).filter(j -> j%20==0);
//		
//		by10.forEach(i->System.out.print(i+ " "));
//		System.out.println();
		
//		int sum=by10.reduce(0,(c,e)->c+e);
//		System.out.println("Sum of="+sum);
		
		
		
		//Collection api improvements
		List<Integer> clist=new ArrayList<Integer>();
		for(int i=1;i<10;i++) {
			clist.add(i);
		}
		
		//removing even numbers
		//clist.removeIf(i-> i%2==0);
		
		//replacing every elements;
		//clist.replaceAll(i->i+1);
		
		
		
		System.out.println(clist);
		
	}
	
	

}
