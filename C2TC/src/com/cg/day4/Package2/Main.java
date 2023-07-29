package com.cg.day4.Package2;
import com.cg.day4.Package1.*;
public class Main {
	public static void main(String[] args)
  {
	      AccessSpecify obj =new AccessSpecify();
          obj.show();
          obj.free();
// Both private and protected varaible/methord cannot be accessed from other class
//ERROR:The method priv() from the type AccessSpecify is not visible
//ERROR:The method pro() from the type AccessSpecify is not visible      
//          obj.priv();          
//          obj.pro();
  }
}
