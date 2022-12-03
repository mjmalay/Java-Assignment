/*1. Write a java program to find following using looping and decision making 
without function
       VIII. Sum of product of consecutive even digits of any digit number  */

import java.util.Scanner;
public class Assignment2_1viii 
{
    public static void main(String[] args) 
    {
        int num,even,sumOfProduct=0,i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any digit number : ");
        num=sc.nextInt();
        int temp=num;
        while(num>0)
        {
            i=num%10;
            j=(num/10)%10;
            if(i%2==0 )
            {
                if(j%2==0)
                {
                    sumOfProduct=sumOfProduct+(i*j);
                }
                 
            }
            num=num/10;
        }
        System.out.println("Sum of product of consecutive even digits of "+ temp+ " is = "+sumOfProduct);
    }    
}
