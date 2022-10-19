package com.mycompany.oop;

/**
 *Create an abstract class 'Bank' with an abstract method 'getBalance'. 
 $100, $150 and $200 are deposited in banks A, B and C respectively. 
  'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. 
Call this method by creating an object of each of the three classes
 */
public class BankBalance {
    public static void main(String[] args)
    {
        A sc=new A();
        B obj1=new B();
        C obj2=new C();
        sc.getBalance();
        obj1.getBalance();
        obj2.getBalance();
        
    }
    
}
abstract class Bank
{
    abstract void getBalance();
}

class A extends Bank
{
    void getBalance()
   {
     System.out.println("$100 is deposited in banks A");  
   }
}
class B extends Bank
{
     void getBalance()
    {
        System.out.println("$150 is deposited in banks B");
    }
}
class C extends Bank
{
     void getBalance()
    {
        System.out.println("$200 is deposited in banks C");
    }
}

