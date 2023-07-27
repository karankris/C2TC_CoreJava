package com.cg.daytwo.inheritance;
// Multiple inheritance
public class Parent {
	 Parent()
	 {
		 System.out.println("This is the parent class");
	 }

}
 class Child extends Parent
 {
	 Child()
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