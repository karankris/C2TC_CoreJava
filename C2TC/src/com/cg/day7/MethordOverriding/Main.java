package com.cg.day7.MethordOverriding;
// methord overrising
public class Main {
	public static void main (String[] args)
	{
	Animal a ;
	a = new Animal();
	a.action();
	 
	// by using the animal object all the child classes are used
	a =new lion(); //upacasting
	a.action();
	
	a = new cow();
	a.action();
	  		
	}

}
