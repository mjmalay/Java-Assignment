/*1. Write a java program to find following using looping and decision making 
without function
        IX. Sum of product of consecutive odd digits of any digit number
             */
import java.util.*;

public class Assignment2_1ix 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,i,odd,sumOfProduct=0;
        int j,odd1,odd2;
        System.out.println("Enter any digit number : ");
        num=sc.nextInt();

        while(num>0)
        {
            i=num%10;
            j=(num/10)%10;

            if(i%2!=0 && j%2!=0)
            {
                odd1=i;
                odd2=j;
                sumOfProduct=sumOfProduct+(odd1*odd2);
            }
            num=num/10;
        }
        System.out.println("Sum of product of consecutive odd digits is = "+ sumOfProduct);

    }    
}
