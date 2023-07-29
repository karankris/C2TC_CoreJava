package com.cg.day5;

public class Multileavel {
	Multileavel()
	{
		System.out.println("This is the parent class");
	}
}
 class Child extends  Multileavel{
		Child()
		{
			System.out.println("This is the Child class");
		}
 }
 class Child1 extends Child{
		Child1()
		{
			System.out.println("Child1 class");
		}
}
