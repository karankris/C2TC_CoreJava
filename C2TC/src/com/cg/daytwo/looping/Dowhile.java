package com.cg.daytwo.looping;
public class Dowhile {

	public static void main(String[] args) {
		 int n=1;
		do {	
			
			 System.out.println("do is executed "+n);
			n++; // loop executed 10 times
		 }
		 while(n<=10);
		 {
			 System.out.println("n is "+n); 
			 // increment the do once after the condition n<=10 -> 10 is incremented  as 11 after the loop 
			
		 }	
		
	}

}

