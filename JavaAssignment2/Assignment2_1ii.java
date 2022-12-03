/*1. Write a java program to find following using looping and decision making 
without function 
        II. Sum of all even digits of any number */
import java.util.Scanner;
public class Assignment2_1ii 
{
    public static void main(String[] args) 
    {
        int num,even,i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        num=sc.nextInt();
        while(num>0)
        {
            i=num%10;
            if(i%2==0)
            {
                sum=sum+i;    
            }
            num=num/10;
        }
        System.out.println("Sum of all  even digits : "+sum);
    }    
}
