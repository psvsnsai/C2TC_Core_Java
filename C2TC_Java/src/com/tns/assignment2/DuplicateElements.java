package com.tns.assignment2;

public class DuplicateElements {

	public static void main(String[] args) {
		
		int[] a= {3,5,4,3,2,2,1};
		System.out.print("duplicate values are: ");
		
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length; j++)
			 {
				 if((a[i]==a[j])&&(i!=j))
				 { 
					 System.out.print(a[j]+",");
				 }
			 }
		}
	}
}
				 

			 
		
		
		            
		           
		            
		                        
		                        
		                        
		                                     
	


