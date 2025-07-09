package com.java8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StramAPI {

	public static void main(String[] args) {
		 
		List<Integer>  list= Arrays.asList(6,3,4,5,3,2,10);
		System.out.println(".......The Result of list is ...... ");
     	list.forEach(n -> System.out.print(n + ", "));
		
//		list.forEach(n ->{
//			if (n%2==0) {
//				System.out.print(n + " ");
//				
//			}
//		});
		
//		list.forEach(n ->{
//			if (n%2!=0) {
//				System.out.print(n + " ");
//				
//			}
//		});
     	
     Stream<Integer> stream = list.stream();
     long l = stream.count();
     System.out.println("Length : "+l);
     
     
     // Stream can only used once
     // for sorting data
      stream= list.stream().sorted();
    
      
      // map perform operation on whole data
      
     stream.forEach(n-> System.out.print(n+ ", "));
     Stream<Integer> mapStream = list.stream().map(n-> n+n);
     mapStream.forEach(n-> System.out.println(n+", "));
     
     // filter : for the filtration purpose
     
     System.out.println("---------map---------");
     Stream<Integer> fiStream = list.stream().filter(n-> n% 2==0);
     fiStream.forEach(n-> System.out.print(n +" ,"));
     
     System.out.println("-----------------");
     list.stream().map(n-> n+2).filter(n-> n%2 ==0)
     .sorted().forEach(n -> System.out.print(n+"  ,"));
		
		
	

	}

}

