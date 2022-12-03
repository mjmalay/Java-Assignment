/*1. Write a java program to find following using looping and decision making without function
   V. Difference between average of all even digits except divisible by 4 and average of all odd digits except divisible by 3     */

import java.util.Scanner;
public class Assignment2_1v 
{
    public static void main(String[] args) 
    {
        int num,even=0,odd=0,i,a=0;
        int aCount = 0, oCount=0;
        float EvenAvg=0,OddAvg=0,difference;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any digit number : ");
        num=sc.nextInt();

        while(num>0)
        {
            
            i=num%10;
            if(i%2==0) 
            {
                if(i/4!=0)
                {
                    aCount++;
                    even=even+i;    
                }
            }
            else
            {
                if(i%3 != 0){
                    oCount++;
                    odd=odd+i;
                }
            }
            num=num/10;
        }  
        EvenAvg=even/aCount;
        OddAvg=odd/oCount;

        difference=EvenAvg-OddAvg;
        System.out.println("Difference between average of all even digits except divisible by 4 and average of all odd digits except divisible by 3 :"+difference);

    }    
}
