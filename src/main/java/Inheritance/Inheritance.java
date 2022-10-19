package Inheritance;

/**
 *Create a class with a method that prints "This is parent class" and
 its subclass with another method that prints "This is child class". 
 Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class

 */
public class Inheritance {
    public static void main(String[] args)
    {
      System.out.println("method of parent class by object of parent class");
      Parent sc=new Parent();
      sc.display();
      System.out.println("method of child class by object of child class");
      Child obj=new Child();
      obj.show();
      System.out.println("method of child class by object of child class");
      obj.display();
    }
}
class Parent
{
    void display()
    {
        System.out.println("This is parent class");
    }
}
class Child extends Parent
{
 void show()   
 {
     System.out.println("This is child class");
}
}