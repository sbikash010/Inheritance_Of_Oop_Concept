package com.mycompany.oop;

/**
 *We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A 
  and in four subjects (each out of 100) by student B. 
  Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
  It is inherited by two other classes 'A' and 'B' each having a method with the same name which 
  returns the percentage of the students. The constructor of student A takes the marks in three subjects as
 its parameters and the marks in four subjects as its parameters for student B. 
  Create an object for each of the two classes and print the percentage of marks for both the students.
 */
import java.util.Scanner;
public class MarkPercentage {
   public static void main(String[] args)
   {
       float am1,am2,am3,bm1,bm2,bm3,bm4;
       Scanner sc=new Scanner(System.in);
       System.out.println("Student A gots the mark of first subject");
       am1=sc.nextFloat();
       System.out.println("Student A gots the mark of second subject");
       am2=sc.nextFloat();
       System.out.println("Student A gots the mark of third subject");
       am3=sc.nextFloat();
       System.out.println("Student B gots the mark of first subject");
       bm1=sc.nextFloat();
       System.out.println("Student B gots the mark of second subject");
       bm2=sc.nextFloat();
       System.out.println("Student B gots the mark of third subject");
       bm3=sc.nextFloat();
       System.out.println("Student B gots the mark of four subject");
       bm4=sc.nextFloat();
       A obj=new A(am1,am2,am3);
       System.out.println("Studnet A got percentage of three subject "+obj.getPercentage());
       B st=new B(bm1,bm2,bm3,bm4);
       System.out.println("Studnet B got percentage of four subject "+st.getPercentage());
       
       
   }
}
abstract class Mark
{
    public abstract float getPercentage();
}

class A extends Mark
{
    float a,b,c;
    A(float am1,float am2,float am3)
    {
       a=am1;
       b=am2;
       c=am3;
    }
    public float getPercentage()
    {
        float total=((a+b+c)/(float)300)*100;
        return total;
    }
    
}
class B extends Mark
{
    float l,m,n,o;
    B(float bm1,float bm2,float bm3,float bm4)
    {
       l=bm1;
       m=bm2;
       n=bm3;
       o=bm4;
    }
    public float getPercentage()
    {
        float total=((l+m+n+o)/(float)400)*100;
        return total;
    }
    
}
