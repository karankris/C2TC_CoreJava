package com.cg.daytwo.inheritance;
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
 class Schild extends Child
{
	 Schild()
	 { 
		 
		 System.out.println("child 2");
	 }
}