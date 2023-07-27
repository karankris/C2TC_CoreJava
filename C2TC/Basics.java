package com.cg.dayone;
import java.util.*;
public class Basics {
          
        public static void main(String[]args){
        	  int c=0,orginal,s=0,r=0;
        	  Scanner sc = new Scanner(System.in);
        	  System.out.print("enter the number: ");
        	  int n = sc.nextInt();
        	  orginal = n;
        	 
        	  while(n>0)
        	  {
        		n=n/10;
        		c++;
        	  }
        	  n = orginal ;
        	  while(n>0)
        	  {
        		  r=n%10;
        		  s+=(Math.pow(r, c));
        		  n/=10;
        	  }
        	  if(s == orginal)
        	  {
        	  System.out.println("It is a amstrong number");
          }
        	  else
        	  {
        		  System.out.println("It is not a amstrong number");
        	  }
}
}
