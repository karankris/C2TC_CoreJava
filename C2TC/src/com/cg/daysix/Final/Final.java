package com.cg.daysix.Final;

 final public class Final {
       
	  String name;
	  int id;
	  String gender;
	  final int a=20; // The value of a=20 will not  be changed at object creation
	  
	  Final(String name, int id , String gender,int a)
	  {
		  this.name=name;
		  this.id=id;
		  this.gender=gender;
	  }
}

// class a extends Final          // cannot inherit a final class
// {
//	 void show()
//	 {
//		 System.out.println("extends the base class");
//	 }
// }