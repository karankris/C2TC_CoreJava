package com.cg.day1;
// program for type casting
public class Typecasting {

	public static void main(String[] args) {
	        int a =10;
	        float b =a;
	        System.out.println(" The type casting form int to float is: "+b);     
	        
	        int c =97;
	        System.out.println(" The type casting form int to  is: char " +(char)c);// syntax to convert to char
	       System.out.println(((Object)a).getClass().getSimpleName()); // To show which data type 
	   
	}

}
