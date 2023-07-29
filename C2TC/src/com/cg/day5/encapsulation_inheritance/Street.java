package com.cg.day5.encapsulation_inheritance;

public class Street extends Country{
   
	private String  st_name;
	private  int st_code;
	
	public String getSt_name() {
		return st_name;
	}
	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}
	public int getSt_code() {
		return st_code;
	}
	public void setSt_code(int st_code) {
		this.st_code = st_code;
	}
	@Override
	public String toString() {	                                       
		return "\nStreet_name:" + st_name +  "\nStreet_code:" + st_code +  "\ncountry_code" +c_code+ "\n";  //extends the country code too Street class
	}
	
}
