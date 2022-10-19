package com.mycompany.oop;

/**
 *run time polymorphism
 */

//run time polymorphism
class Parent
{
    void display()
    {
        System.out.println("i am parent class");
    }
}
class Child extends Parent
{
     void display()
    {
        System.out.println("i am class class");
    }
}
class GrandChild extends Child
{
     void display()
    {
        System.out.println("i am grandchild");
    }
}

public class Runtimepolymorphi {
    public static void main(String[] args)
    {
        Parent obj=new Parent();
        obj.display();
        Parent obj1=new Child();
        obj1.display();
        Parent obj2=new GrandChild();
        obj2.display();
    }

}













