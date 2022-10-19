package com.mycompany.oop;

/**
 *Create an abstract class 'Parent' with a method 'message'. 
  It has two subclasses each having a method with the same name 'message' that 
  prints "This is first subclass" and "This is second subclass" respectively. 
  Call the methods 'message' by creating an object for each subclass.
 */
public class AbstractParent {
    public static void main(String[] args)
    {
        SubClass1 sc=new SubClass1();
        SubClass2 obj=new SubClass2();
        sc.massege();
        obj.massege();
    }
    
}
abstract class Parent
{
    abstract void massege();
}

class SubClass1 extends Parent
{
    void massege()
   {
     System.out.println("This is first subclass");  
   }
}
class SubClass2 extends Parent
{
     void massege()
    {
        System.out.println("This is second subclass");
    }
}

