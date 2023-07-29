package com.cg.daytwo.Control_Statements;
public class Nested_Ifelse {
	public static void main(String [] args)
	{
		int a = 10, b=13;
	 if(a%10==0)
	 {              // returns only this "if" statement if the condition is true or goto next if
		 System.out.println("First if statement "+a); 
	 }
		 if(b%10==0)
		 {
			 System.out.println("Second if statement "+b);
		 }
	 else
	 {
		 System.out.println("Both are False or any one is False");
	 }
	}
}