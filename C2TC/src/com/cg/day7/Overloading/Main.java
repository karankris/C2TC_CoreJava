package com.cg.day7.Overloading;

public class Main {

	public static void main(String[] args) {
		  SBI_bank s = new SBI_bank() ;
			 
		  System.out.println("The intrest :"+ s.intrest(0.5f,25));
		                         // By using the SBI we can print the intrest of the RBI by using by methord overloading
		  System.out.println("The intrest is:"+ s.intrest(5,25));
		  
		  Constructor_overload c =  new Constructor_overload();
		  Constructor_overload d =  new Constructor_overload(10,20);
		      System.out.println("The First constructor is" +d);
		  
		  
	}

}
