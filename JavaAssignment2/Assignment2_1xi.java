/*1. Write a java program to find following using looping and decision making without function
            XI. Difference between Sum of product of consecutive even digits except 2 and 6 and Sum of product of consecutive odd digits except 3 and 7 of any digit number  
 */

import java.util.Scanner;
public class Assignment2_1xi 
{
    public static void main(String[] args) 
    {
        int num,rem1,rem2,SumOfEven=0,SumOfOdd=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any digits number : ");
        num=sc.nextInt();
        while(num>0)
        {
            rem1=num%10;
            rem2=(num/10)%10;
            if(rem1%2==0 && rem2%2==0)
            {
                if((rem1!=2 && rem1!=6 ) && (rem2!=2 && rem2!=6))
                {
                    SumOfEven+=(rem1*rem2);
                }
            }
            else if(rem1%2!=0 && rem2%2!=0)
            {
                if((rem1!=3 && rem1!=7) && (rem2!=3 && rem2!=7))
                {
                    SumOfOdd+=(rem1*rem2);
                }
            }
            num=num/10;
        }
        System.out.println("Sum of Product of consecutive even number : "+SumOfEven);
        System.out.println("Sum of product of consecutive odd number : "+SumOfOdd);
        System.out.println(" Difference between Sum of product of consecutive even digits except 2 and 6 and Sum of product of consecutive odd digits except 3 and 7 of any digit number = "+ (SumOfEven-SumOfOdd));
    }
}
