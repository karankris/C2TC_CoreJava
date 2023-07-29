package com.cg.dayfive.inheritance;

// Multiple inheritance
public class Multileavel {
	 Multileavel()
	 {
		 System.out.println("This is the parent class");
	 }

}
 class C1 extends Multileavel
 {
	 C1()
	 {
		 System.out.println("child 1");
	 }
 }
 class Schild extends C1
{
	 Schild()
	 { 
		 
		 System.out.println("child 2");
	 }
}