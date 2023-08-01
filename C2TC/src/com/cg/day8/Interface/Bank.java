package com.cg.day8.Interface;

public interface Bank {
     static final  float Min_balance=5000;
     static final float deposit_limit=25000;
     
      void deposit(float amt);
      void withdraw(float amt);
}
