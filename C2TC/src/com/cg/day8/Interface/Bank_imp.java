package com.cg.day8.Interface;
public class Bank_imp extends Savings implements Bank //It extends the child child
{
	 int balance =10000;
@Override
public void deposit(float amt) {
	if(amt<=deposit_limit)
	{
		balance+=amt;
		System.out.println("Balance after Deposited "+balance);
	}
	else
	{
		System.out.println("Your amount limit exceeded");
	}
	
}
@Override
public void withdraw(float amt) {
	if(balance>=amt+Min_balance)
	{
		balance-=amt;
		System.out.println("Current balance  after withdrawal is "+balance);
	}
	else
	{
		System.out.println("");
	}
	

}
}
