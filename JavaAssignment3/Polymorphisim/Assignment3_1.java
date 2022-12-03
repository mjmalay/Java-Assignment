/* 1) Write a program to find area and perimeter of circle,square,rectangle and triangle using method overloading? */

import java.util.Scanner;
import java.lang.*;
class Test
{
    double area(float r)
    {
        double areaOfCircle=3.14*r*r;
        return areaOfCircle;
    }
   public  double area(int side)
    {
        
        return side*side;
    }
    double area(float ln,float br)
    {
        double areaOfRect=ln*br;
        return areaOfRect;
    }
    double area(float a,float b,float c)
    {
        float s=(a+b+c)/2;
        double areaOftriangle=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return areaOftriangle;
    }


    double perimeter(float r)
    {
        double perOfcircle=2*3.14*r;
        return perOfcircle;
    }
    
    double perimeter(int side)
    {
        
        return 4*side;    
    }
    
    double perimeter(float ln,float br)
    {
        double perOfRect=2*(ln+br);
        return perOfRect;
    }
    
    double perimeter(float a,float b,float c)
    {   
        double perOfTriangle=a+b+c;
        return perOfTriangle;
    }
}

public class Assignment3_1 
{
    public static void main(String[] args) 
    {
        Test t=new Test();
        float r,ln,br,a,b,c;
        int side;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radious of the circle :");
        r=sc.nextFloat();
        System.out.println("Enter the lentgth of the Square : ");
        side=sc.nextInt();
        System.out.println("Enter the length and breadth of the Rectangle : ");
        ln=sc.nextFloat();
        br=sc.nextFloat();
        System.out.println("Enter the the sides of triangle : ");
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();

        double areaCircle=t.area(r);
        double areaSquare=t.area(side);
        double areaRect=t.area(ln,br);
        double areaTriangle=t.area(a,b,c);

        double perCircle=t.perimeter(r);
        double perSquare=t.perimeter(side);
        double perRect=t.perimeter(ln,br);
        double perTriangle=t.perimeter(a,b,c);

        System.out.println("Area of circle :"+areaCircle);
        System.out.println("Area of Square : "+areaSquare);
        System.out.println("Area of Rectangle : "+areaRect);
        System.out.println("Area of Triangle : "+areaTriangle);

        System.out.println("Perimeter of circle :"+perCircle);
        System.out.println("Perimeter of Square : "+perSquare);
        System.out.println("Perimeter of Rectangle : "+perRect);
        System.out.println("Perimeter of Triangle : "+perTriangle);
    }
    
}
