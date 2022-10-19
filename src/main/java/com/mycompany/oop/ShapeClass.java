package com.mycompany.oop;

/**
 *We have to calculate the area of a rectangle, a square and a circle. 
 Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' 
 taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. 
 The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side
 and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the 
  three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
  area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods.
 */
import java.util.Scanner;
public class ShapeClass {
      public static void main(String[] args)
    {
        float rl,rb,sl,cr;
        Scanner obj=new Scanner(System.in);
        Area sc=new Area();
        
        System.out.println("length of rectangle ");
        rl=obj.nextFloat();
        System.out.println("breath of rectangle ");
        rb=obj.nextFloat();
        System.out.println("length of square ");
        sl=obj.nextFloat();
        System.out.println("radius of circle ");
        cr=obj.nextFloat();
        sc.RectangleArea(rl,rb);
        sc.SquareArea(sl);   
        sc.CircleArea(cr); 
    }   
}
abstract class Shape
{
    public float area;
    public final float pi=3.14f;
    abstract void RectangleArea(float a,float b);
    abstract void SquareArea(float l);
    abstract void CircleArea(float r);
}

class Area extends Shape
{
    void RectangleArea(float a,float b)
   {
     area=a*b;
     System.out.println("area of rectangle is "+area);
   }
    public void SquareArea(float l){
     area=l*l;
     System.out.println("area of squar is "+area);
            }
    public void CircleArea(float r){
        area=pi*r*r;
        System.out.println("area of circle is "+area);
        
    }
}


