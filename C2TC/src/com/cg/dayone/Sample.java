package com.cg.dayone;

public class Sample {
       int a=20;
	 public int b=30;
	 private int c=40;
	 protected int d=50;


	   void display()
	   {
	           
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
         System.out.println(d);
	   
	   }


public static void main(String [] args)
{
	   Sample obj =new Sample();
	   obj.display();
}

}