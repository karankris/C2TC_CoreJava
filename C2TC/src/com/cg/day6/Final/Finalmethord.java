package com.cg.day6.Final;

public class Finalmethord {
    
   
	public void display()
	{
		System.out.println("This is final methord");
	}
}
class  Finalclass extends Finalmethord
{
	@Override 
	public void display()
	{
		System.out.println("cannot override the final methord");
	}

}

