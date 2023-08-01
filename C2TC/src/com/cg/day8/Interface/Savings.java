package com.cg.day8.Interface;
// This is a savings account 
public class Savings extends Person{
   private int accno;
	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}
	@Override
	public String toString() {
		return "Savings account number [accno=" + accno +  "]";
	}
     
}
