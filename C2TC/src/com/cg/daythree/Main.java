package com.cg.daythree;

public class Main {
	public static void main(String [] args){
		Encapsulation ob = new Encapsulation("karan",101,63793636347L);
		Encapsulation obj = new Encapsulation("balaji",102,6242342324L);
		Encapsulation obk= new Encapsulation("jp",103,93793636347L);
		 System.out.println(ob.getId());
		 System.out.println(ob.getName());
		 System.out.println(ob.getPhone());
		 System.out.println(obj.getId());
		 System.out.println(obj.getName());
		 System.out.println(obj.getPhone());
		 System.out.println(obk.getId());
		 System.out.println(obk.getName());
		 System.out.println(obk.getPhone());


		//System.out.println("The details are"+ob.toString());
		
	}
	

}
	