package com.mycompany.oop;

/**
 *An abstract class has a constructor which prints "This is constructor of abstract class", 
 an abstract method named 'a_method' and a non-abstract method which prints "This is a normal method of abstract class".
 A class 'SubClass' inherits the abstract class and has a method named 'a_method' which prints "This is abstract method".
 Now create an object of 'SubClass' and call the abstract method and the non-abstract method. (Analyse the result)
 */
public class AbstractMethodNonAbstractMethod {
    public static void main(String[] args)
    {
        SubClass sc=new SubClass();
        sc.non_a_method();
    }
}
abstract class ConStructor{
    ConStructor()
    {
      System.out.println("This is constructor of abstract class");  
    }
    abstract void a_method();
    void non_a_method(){
        System.out.println("This is a normal method of abstract class");
    }
}
class SubClass extends ConStructor
{
    void a_method(){ }
    
}
