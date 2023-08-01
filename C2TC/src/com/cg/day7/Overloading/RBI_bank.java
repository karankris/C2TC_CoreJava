package com.cg.day7.Overloading;

public class RBI_bank {	   
	 public int intrest(int a,int b)
	 {
		return a*b;
	 }
}
 class SBI_bank extends RBI_bank
{
	public float intrest(float c,int d)
	{
		return c*d;
	}
}
