package com.mycompany.oop;

/**
 *Implementation  of Multilevel inheritance
 
 */
//Impl of Multilevel inheritance
import java.util.Scanner;
public class Oop {

    public static void main(String[] args) {
        int num1,num2;
        Grandson sc=new Grandson();
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first number ");
        num1=obj.nextInt();
        System.out.println("Enter the second number ");
        num2=obj.nextInt();
        sc.getdata(num1, num2);
        sc.display();
        
        
    }
}
class Father {
    int a,b;
    void getdata(int x,int y)
    {
        a=x;
        b=y;
    }
}
class Son extends Father
{
    int c=10;
    int sum;
    int add()
    {
      sum=a+b+c;
      return sum;
    }
}
class Grandson extends Son
{ 
    void display()
    {
        System.out.println("value of first "+a);
        System.out.println("value of second "+b);
        System.out.println("value of third "+c);
        System.out.println("sum of value "+add());
    }
}
