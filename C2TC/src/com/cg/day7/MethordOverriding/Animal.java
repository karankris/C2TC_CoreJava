package com.cg.day7.MethordOverriding;

public class Animal {

	void action()
	{
		System.out.println("Animals eat sleep hunt..");
	}
}
class lion extends Animal
{
	@Override
	void action()
	{
		System.out.println("Lion Hunts and eats");
	}
}
 class cow extends Animal
 {
	 @Override
	 void action()
	 {
		 System.out.println("Cow eats and sleeps");
	 }
 }

