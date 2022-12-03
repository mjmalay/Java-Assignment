/*1) Write a program to create simple calculator for addition, subtraction, division, multiplication, 
modulus, factorial, gcd, lcm, power, square root, cube root using class and object? */
import java.lang.*;
import java.util.*;
class calculator
{
    public void addition(int a,int b)
    {
        System.out.println("The addition of "+a+" and "+b+" is : "+(a+b));
    }
    public void substraction(int a,int b)
    {
        System.out.println("The substraction  of "+a+" and "+b+" is : "+(a-b));
    }
    public void multiplication(int a,int b)
    {
        System.out.println("The Multiplication of "+a+" and "+b+" is : "+(a*b));
    }
    public void division(float a,float b)
    {
        System.out.println("The Division of "+a+" and "+b+" is : "+(a/b));
    }
    public void modulus(int a,int b)
    {
        System.out.println("The Modulus of "+a+" and "+b+" is : "+(a%b));
    }
    public void factorial(int a)
    {
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+a+" is :"+fact);
    }
    public void gcd(int a,int b)
    {
        int g=1;
        for(int i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                g=i;
            }
        }
        System.out.println("GCD of "+a+" and "+b+" is :"+g);
    }

    public void lcm(int a,int b)
    {
        int l;
        l=(a>b)?a:b;
        while(true)
        {
            if(l%a==0 && l%b==0)
            {
                System.out.println("The LCM of "+a+" and "+b+" is :"+l);
                break;
            }
            l++;
        }
    }
    public void power(int num,int expo)
    {
        int p=1;
        for(int i=1;i<=expo;i++)
        {
            p=p*num;
        }
        System.out.println("The power of "+num+" is :"+p);
    }
    public void squareRoot(int num)
    {
        System.out.println("The square root of "+num+" is :"+Math.sqrt(num));
    }
     
    public void CubeRoot(int num)
    {
        System.out.println("The cube roots of "+num+" is :"+Math.cbrt(num));
    }

}

public class Assignment3_1
{
    public static void main(String[] args) 
    {
        calculator c1= new calculator();
        c1.addition(2, 3);
        c1.substraction(4, 3);
        c1.multiplication(5, 6);
        c1.division(7, 9);
        c1.modulus(5, 3);
        c1.factorial(5);
        c1.gcd(12,8);
        c1.lcm(2, 4);
        c1.power(10, 2);
        c1.squareRoot(25);
        c1.CubeRoot(27);
    }   
}
