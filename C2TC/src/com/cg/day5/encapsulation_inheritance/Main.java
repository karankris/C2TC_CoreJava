package com.cg.day5.encapsulation_inheritance;

public class Main {

	public static void main(String[] args) {
 //Multileavel inheritance
    city c = new city();
    state s =new state();
    Street st =new Street();
    
   
     c.setCname("India");
     st.setC_code(1007);
     s.setS_name("TamilNadu");
     c.setCity_name("villupuram"); 
     st.setSt_name("Pillaiyarkovil_st");
     st.setSt_code(605103);
  
   //with using getter methord
 System.out.println("Country_name:"+c.getCname()+"\nCountry_code: "+st.getC_code()+"\nCity_name:"+c.getCity_name()+"\nState_name:"+s.getS_name()+"\n");  

 //without using getter making the parent class variable as public/protected and add the parent variable in toSting methord in base class
 System.out.println(st);    
	}
}
 



//     Hierarchical inheritance

//	        COUNTRY (parent class)
//	       /   |  \
//	      /    |   \
//(c1)STATE    |   STREET(c3)  child-(c1,c2,c3)
//             |
//          CITY(c2)