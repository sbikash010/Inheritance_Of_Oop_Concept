package Inheritance;

/**
 *Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
 two methods to print the area and perimeter of the rectangle respectively. 
 Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle.
 Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling
 the constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square
 */
public class SuperInheritance {
    public static void main(String[] args)
    {
        Square sc=new Square(20);
        Rectangle obj=new Rectangle(40,60);
         obj.area();
        obj.perimeter();
        sc.area();
        sc.perimeter();
    }
}
class Rectangle {
    private double length;
    private double breath;
    public Rectangle(double length,double breath)
    {
        this.length=length;
        this.breath=breath;
    }
       public void area()
        {
         double areas=length*breath;  
          System.out.println("area of rectangle is "+areas);
        }
        void perimeter()
        {
            double peri=4*(length+breath);
            System.out.println("perimeter of rectangle is "+peri);
        }
}
class Square extends Rectangle {
    private double side;
    public Square(double side)
    {
        super(side,side);
        this.side=side;
    }
       public void area()
        {
         double areas=side*side;  
          System.out.println("area of square is "+areas);
        }
        void perimeter()
        {
            double peri=4*side;
            System.out.println("perimeter of square is "+peri);
        }
       
}