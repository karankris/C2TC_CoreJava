// use of arithmetic(%), assignment(=),relational(==,<) operators
package com.cg.daytwo;
import java.util.*;
public class Operators {
	  public static void main(String[]args)
	  {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("enter the value:");
		 int n = sc.nextInt();
		 int flag=0;
		 for(int i=2;i<=n/2;i++)
		 {
			 if(n%i==0)
			 {
				 flag=1;
			 }
		 }
			 if(flag==0)
			 {
				 System.out.println("It is a prime number");
			 }
			 else 
			 {
				 System.out.println("Not a prime");
			 }
		 
		  
	  }

}
