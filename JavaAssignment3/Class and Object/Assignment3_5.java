/*5) Write a program to find area and perimeter of triangle having 3 sides using class and object? */
import java.lang.*;
class Triangle
{
    float a;
    float b;
    float c;
    Triangle(float a,float b,float c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    double area()
    {
        double s=(float)(a+b+c)/2.0;
        double Ar=(double)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return Ar;
    }
    double perimeter()
    {
        return a+b+c;
    }
}



public class Assignment3_5 
{
    public static void main(String[] args) 
    {
        Triangle t=new Triangle(3, 5.6, 2.6);
        System.out.println("Area of a triangle :"+t.area());
        System.out.println("Perimeter of a triangle :"+t.perimeter());    
    }    
}
