// All the access specifiers works within the class
package com.cg.day4.Package1;
public class AccessSpecify {
          int a=20;
	 public int b=30;
	 private int c=40;
	 protected int d=50;
	 public void show()
	   {      
            System.out.println(a);
	   }
	 public void free()
	   {
            System.out.println(b);
	   }
	 private void priv()
	 {
            System.out.println(c);
	 }
	 protected void pro()
	 {
            System.out.println(d);
	   
	   }
}