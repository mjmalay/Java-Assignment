/*1. Write a java program to find following using looping and decision making 
without function 
            iii.Sum of all odd digits of any number */

import java.util.Scanner;
public class Assignment2_1iii 
{
    public static void main(String[] args) 
    {
        int num,odd,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        num=sc.nextInt();
        while(num>0)
        {
            odd=num%10;
            if(odd%2!=0)
            {
                sum=sum+odd;    
            }
            num=num/10;
        }
        System.out.println("Sum of all odd digits : "+sum);
    }    
}
