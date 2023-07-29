package com.cg.daysix.Final;

public class Main {

	public static void main(String[] args) {
		                                  
		                            // FINAL CLASS & FINAL VARIABLE
		  Final obj = new Final("Ravi",1,"male",10); // In object even though 10 is declared in place of "a" the value will not be changed
		         System.out.println( obj.name);
		         System.out.println( obj.id);
		         System.out.println( obj.gender);		  
		         System.out.println(obj.a);
              
		         //		  a ob = new a();
              //		  ob.show();      cannot extends the Final class ERROR:(The type a cannot subclass the final class Final)
		     
		         //FINAL METHORD
		         Finalmethord ob = new Finalmethord();
		         ob.display();

	}

}
