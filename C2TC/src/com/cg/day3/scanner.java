package com.cg.day3;
import java.util.Scanner;     // import the scanner class from java.util
public class scanner {
   public static void main(String[] args)
   {
	     //Create objects for scanner
		 Scanner sc = new Scanner(System.in);  
		 Scanner c = new Scanner(System.in);
		 Scanner st = new Scanner(System.in);
	     
	    //Get the inputs according to the data types
		   System.out.println("enter the integer:");
		    int num = sc.nextInt();
		   System.out.println("enter the character: ");
		    char ch = c.nextLine().charAt(0);
		   System.out.println("Enter the String: ");
		    String s = st.nextLine();
		     
	    //Print those  input 
		    System.out.println("Integer "+num);
	        System.out.println("character "+ch);
		    System.out.println("String "+s);
		    
	    //Close the scanner after use to maintain the wastage of memeory
	     sc.close();  
	     c.close();
	     st.close();
   }
 
}
