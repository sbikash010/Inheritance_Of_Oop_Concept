package Inheritance;

/**
 *Create a class named 'Shape' with a method to print "This is This is shape". 
  Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, 
 both having a method to print "This is rectangular shape" and "This is circular shape" respectively. 
  Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle". 
 Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.
 */
public class ShapeInheritanc {
    public static void main(String[] args)
    {
        Square sb=new Square();
        sb.show();
        sb.view();
    }
}
class Shape {
    void show()
    {
        System.out.println("This is This is shape");
    }
}
class Rectangle extends Shape {
      void view()
    {
        System.out.println("This is rectangular shape");
    }   
}
class Circle extends Shape {
      void display()
    {
        System.out.println("This is circular shape");
    }   
}
class Square extends Rectangle {
      void visible()
    {
        System.out.println("Square is a rectangle");
    }   
}