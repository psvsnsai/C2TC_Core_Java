package com.tns.assignments;

public class ForWhileDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//For loop
		  for(int i=1,j=1; i<10||j<10;i++,j++)
		  { 
			  j++;
			  System.out.println("i="+i+" and j="+j); 
			  
		  }
		  System.out.println();

// while loop 
			  int i=1,j=1;
			  while(i<10 || j<10)
			  { 
				  i++; j++;
				  
			      System.out.println("i="+i+" and j="+j); 
			  }j++;
			  System.out.println();
			
// Do while loop
			int a = 1, b = 1;
			do {
				a++;
				b++;
				System.out.println("a=" + a + " and b=" + b);
			    } while (a < 10 || b < 10);


	}

}
