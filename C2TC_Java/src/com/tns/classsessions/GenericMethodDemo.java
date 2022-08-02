 //java generic method to print array elements

package com.tns.classsessions;

public class GenericMethodDemo {
	  
	      public static < E > void printArray(E[] elements)
	      {  
	       
	    	  for(E element : elements)   //E- Denote the element
	        {          
	            System.out.println(element);  
	        }  
	         System.out.println();  
	      }
	   // we can create a generic method that can accept any type of arguments.
	      
	       public static void main( String args[] ) { 
	    	   
	        Integer[] intArray = { 10, 20, 30, 40, 50 };  
	        Character[] charArray = { 'A', 'B', 'C', 'D', 'E','F','G','H','I' };  
	  
	        System.out.println( "Printing Integer Array" );  
	        printArray( intArray);   
	  
	       System.out.println( "Printing Character Array" );  
	        printArray( charArray);   
	    }   
	}  