package com.cg.daythree;

public class Encapsulation {

	private String name;
	private int id;
	private long phone;

	public Encapsulation(String name, int id, long phone) {
		super();
		this.name = name;
		this.id = id;
		this.phone = phone;
	}
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
//	@Override
//	public String toString() {
//		return "Student [Stuname=" + name + ", Sid=" + id + ", Sphone=" + phone + "]";
//	}
	
	
	
}
