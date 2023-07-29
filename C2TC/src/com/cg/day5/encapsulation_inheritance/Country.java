package com.cg.day5.encapsulation_inheritance;
//Hierarchical inheritance
public class Country {
	protected String cname;
	public int c_code;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getC_code() {
		return c_code;
	}
	public void setC_code(int c_code) {
		this.c_code = c_code;
	}
	@Override
	public String toString() {
		return "Country [cname=" + cname + ", c_code=" + c_code + "]";
	}
}
// child class 
class state extends Country
{
	private String s_name;

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	@Override
	public String toString() {
		return "state [S_name=" + s_name + "]";
	}
	
}

class city extends Country
{
	private String city_name;
	
	public String getCity_name()
	{
		return city_name;
	}
	public void setCity_name(String City_name)
	{
		this.city_name = City_name;
	}
	@Override
	public String toString() {
		return "City_name:=" + city_name +"\ncode:"+ c_code+"";
	}
}