/*1. Write a java program to find following using looping and decision making 
without function
       VII. Sum of product of consecutive digits of any digit number  */

import java.util.Scanner;
public class Assingnment2_vii
{
    public static void main(String[] args) 
    {
            int num,sum=0,i,j;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any digit number to find product of sum  : ");
            num=sc.nextInt();
            int temp=num;
            while(num>0)
            {
                i=num%10;
                j=(num/10)%10;
                sum=sum+(i*j);
                num=num/10;
            }

            System.out.println("Product of sum of consecutive digit of "+temp+ " is = "+sum);
    }    
}
