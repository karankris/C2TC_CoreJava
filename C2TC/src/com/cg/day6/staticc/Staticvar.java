package com.cg.day6.staticc; // static variable and change only in static block
public class Staticvar {
         static  int var = 10; //usage of static variable       
static                         //usage of  static block
	 {
	   var = 20;
	}
   void show() 
	 {
      System.out.println("The static block value is "+var); 
	} 
}
