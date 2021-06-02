package com.streams.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamBuilders {

	public static void main(String[] args) 
	{
		/*
		Stream<Integer> stream = Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9});
		stream.forEach(p->System.out.println(p));
	*/
		
		/*
		 List<Integer> list = new ArrayList<Integer>();
		 
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
 
         Stream<Integer> stream = list.stream();
         stream.forEach(p -> System.out.println(p));
	}
	*/
		
		Stream<Integer> randomNumbers = Stream
	             .generate(() -> (new Random()).nextInt(100));
	 
	         randomNumbers.limit(20)
	              .forEach(System.out::println);
}
}
