/*1. Write a java program to find following using looping and decision making 
without function 
          I. Sum of all digits of any numbers */

import java.util.Scanner;
class Assignment2_1i
{
    public static void main(String[] args) 
    {
        int num,i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any digit number :");
        num=sc.nextInt();
        int n=num;
        while(num!=0)
        {
            i=num%10;
            sum=sum+i;
            num=num/10;

        } 

        System.out.println("Sum of "+n+" digit number is = "+ sum);
    }    
}
