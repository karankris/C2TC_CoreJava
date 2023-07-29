package com.cg.day3;
public class Encapsulation {

	private String name;
	private int id;
	private long phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "S_name=" + name + "\nS_id=" + id + "\nS_phone=" +phone + "\n";
	}
	
	
	
}

