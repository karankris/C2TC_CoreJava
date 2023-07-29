package com.cg.day3;
public class Main {
	public static void main(String [] args){
//ENCAPSULATION
		Encapsulation ob = new Encapsulation();
		ob.setId(101);
		ob.setName("karan");
		ob.setPhone(6379363647L);

		System.out.println("The details are::\n"+ob );
		
		
//CONSTRUCTOR
		  Constructor c = new Constructor(201,"karan",200000,"male");
		    System.out.println(c.id);
		    System.out.println(c.name);
		    System.out.println(c.salary);
		    System.out.println(c.gender);
		    
	}
	

}
	