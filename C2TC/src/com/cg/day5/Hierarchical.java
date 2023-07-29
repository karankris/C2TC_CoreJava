package com.cg.day5;

public class Hierarchical {
	Hierarchical()
	{
		System.out.println("This is the parent class");
	}
}
 class Child extends  Hierarchical{
		Child()
		{
			System.out.println("This is the Child class");
		}
 }
 class Child1 extends Hierarchical{
		Child1()
		{
			System.out.println("Child1 class");
		}
}
