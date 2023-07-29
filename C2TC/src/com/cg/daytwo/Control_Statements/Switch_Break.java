package com.cg.daytwo.Control_Statements;
import java.util.*;
public class Switch_Break {

	public static void main(String[] args) {
		while(true)
		{
	    System.out.println("");
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the movie Choice: ");
	    int n = sc.nextInt();
	   
	    System.out.print("Enter the count of tickets:");
	    int cnt =sc.nextInt();
	    int Total_amt=0;		
	    switch(n) {
	                  
	    case 1:	        
	    	System.out.println("Movie name: LEO");	    	
	         Total_amt = cnt*250;
	    	System.out.println(" Total cost of tickets:"+Total_amt);
	    	System.out.println("+--------------------+");
	    	System.out.println("!!!Enjoy your movie!!!");
	    	System.out.println("+--------------------+");
	    	break;
   
	    case 2:	    	
	    	System.out.println("Movie name: JAILER");	    	
	          Total_amt = cnt*200;
	    	System.out.println(" Total cost of tickets:"+Total_amt);
	     	System.out.println("+--------------------+");
	    	System.out.println("!!!Enjoy your movie!!!");
	    	System.out.println("+--------------------+");
	           break;
	    	
	    	
	    case 3:	    	
	    	System.out.println("Movie name: CAPTAIN MILLER");	    	
	          Total_amt = cnt*150;
	    	System.out.println(" Total cost of tickets:"+Total_amt);
	     	System.out.println("+--------------------+");
	    	System.out.println("!!!Enjoy your movie!!!");
	    	System.out.println("+--------------------+");
	    	break;
	    	
	    case 4:	    	
	    	System.out.println("Movie name: THANGALAAN ");	    	
	          Total_amt = cnt*220;
	    	System.out.println(" Total cost of tickets:"+Total_amt);
	     	System.out.println("+--------------------+");
	    	System.out.println("!!!Enjoy your movie!!!");
	    	System.out.println("+--------------------+");
	    	break;		    
	    default:
		   System.out.println("Oops! Movie not available.");
		   	   
	    }	
	    
		}
 }

}
