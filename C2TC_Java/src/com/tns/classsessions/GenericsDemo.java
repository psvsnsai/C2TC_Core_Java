//Java program to demonstrate the use of generics

package com.tns.classsessions;
import java.util.*;

class GenericsDemo{
	
	public static void main(String args[]){ 
			
		ArrayList<String> list=new ArrayList<String>();  
		list.add("rahul");  
		list.add("jai");
		
	  //list.add(32);    //compile time error  
  
		String s=list.get(0);     //type casting is not required  
		System.out.println("element is: "+s);  
  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}  
	}  
}  