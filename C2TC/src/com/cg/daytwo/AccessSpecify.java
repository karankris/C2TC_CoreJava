// All the access specifiers works within the class
package com.cg.daytwo;
public class AccessSpecify {
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
	   AccessSpecify obj =new AccessSpecify();
	   obj.display();
   }

}