package com.cg.day8.Interface;

public class Main {
     public static void main (String[] args) {
    	  
    	 Bank_imp ob = new Bank_imp();
    	 ob.setName("Karan R");
    	 ob. setCity("Villupuram");
         ob.setAccno(102321);// form the child class
    	 System.out.println("City name: "+ob.getCity());
     	 System.out.println("Account holder name:"+ob.getName());
     	 System.out.println(ob);
         ob.deposit(10000);
    	 ob.withdraw(2000);
    	
     }
}
