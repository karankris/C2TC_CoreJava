package com.cg.daytwo.Control_Statements;

public class If_else_ladder {

	public static void main(String[] args) {		
	           int  a=40,b=20; // Try with different input to check all the condition
	           if(a==5 && b!=0) 
	           {
	        	   System.out.println("The values are:" +a+" "+b);
	           }
	            else if(a>b) 
	           {
	        	   System.out.println(" a is greater");
	           }
	           else if(b==a)
	               
	           {
	        	   System.out.println("Equals value");
	           }
	           else 
	           {
	        	  System.out.println(" Finally when all conditions are False");
	           }

	}

}
