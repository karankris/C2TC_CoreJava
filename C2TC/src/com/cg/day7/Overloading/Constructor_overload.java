package com.cg.day7.Overloading;

public class Constructor_overload {
    private int a,b;
	    Constructor_overload(int a, int b)
	    {
	    	this.a=a;
	    	this.b=b;
	    }
	    Constructor_overload()
	    {
	    	
	    	int a=5,b=5;
	    	System.out.println("The addition of integers "+(a+b));
//		   
	    }
		@Override
		public String toString() {
			return "[a=" + a + ", b=" + b + "]";
		}
	    
}
