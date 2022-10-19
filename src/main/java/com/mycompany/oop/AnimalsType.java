package com.mycompany.oop;

/**
 *Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. 
 Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method 'dogs'
 which prints "Dogs bark", both inheriting the class 'Animals'. Now create an object for each of the subclasses and 
 call their respective methods.

 */
public class AnimalsType {
    public static void main(String[] args)
    {
        Cats sc=new Cats();
        Dogs obj1=new Dogs();
        sc.cats();
        obj1.dogs();   
    }   
}
abstract class Animals
{
    abstract void cats();
    abstract void dogs();
}

class Cats extends Animals
{
    public void cats()
   {
     System.out.println("Cats meow");  
   }
    public void dogs(){}
}
class Dogs extends Animals
{
    public void cats(){
    
    }
     void dogs()
    {
        System.out.println("Dogs bark");
    }
}