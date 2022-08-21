package com.tns.classsessions.streamapi;

//import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> l = List.of(10,21,13,34,25,67,80,64,72,55,47);
		System.out.println(l);
		
		//conventional code
//		List<Integer> evenList = new ArrayList<>();
//		for (Integer i: l)  //foreach loop
//		{
//			if (i%2 ==0)
//			{
//			evenList.add(i);
//		}
//	}
//	System.out.println(evenList);
		
		//Using stream API
		Stream<Integer> stream=l.stream();
		//List<Integer> el = stream.filter(i->i<30).collect(Collectors.toList());
		List<Integer> el = stream.map(i->i+10).collect(Collectors.toList());
		System.out.println(el);
	}

}
