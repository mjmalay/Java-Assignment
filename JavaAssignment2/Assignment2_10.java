/*Write a program to generate Fibonacci series up to n terms? Value of n will be accepted from user? */


import java.util.*;
public class Assignment2_10 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num,fib1=0,fib2=1,fib3=fib1+fib2;
        System.out.println("Enter the number");
        num=sc.nextInt();
        System.out.print("Series is :: \t"+fib1+"\t"+fib2);
        while (num>2) 
        {
            fib3=fib1+fib2;
            System.out.print("\t"+fib3);
            fib1=fib2;
            fib2=fib3;
            num--;
        }
    }    
}



