/*6) Write a program to display type of triangle using sides of triangle ? */

import java.util.Scanner;
class Test
{
    float a;
    float b;
    float c;
    Test(float a,float b,float c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void display()
    {
        if(a==b && b==c)
        {
            System.out.println("It is an Equilateral triangle.");
       }else if(a==b || b==c || a==c)
       {
           System.out.println("It is an Isosceles Triangle.");
       }else{
           System.out.println("It is a scalene triangle.");
       }

    }
}
public class Assignment3_6 
{
    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the triangle : ");
        float a,b,c;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        Test t=new Test(a,b,c);
        t.display();
    }    
}
