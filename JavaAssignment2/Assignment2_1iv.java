/*1. Write a java program to find following using looping and decision making 
without function
       IV. Sum of all prime digits  */
import java.util.Scanner;
public class Assignment2_1iv 
{
        public static void main(String[] args) 
        {
            int num,prime,sum=0,i, primeCounter = 0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any digit number : ");
            num=sc.nextInt();

            while(num>0)
            {
                primeCounter = 0;
                prime=num%10;
                if(prime == 1) {
                    num=num/10;
                    continue;
                }
                for(i=2;i<=prime/2;i++)
                {
                    if(prime%i==0)
                    {
                        primeCounter++;
                        break;
                    }
                } 
                if(primeCounter == 0)
                {
                    sum=sum+prime;
                }
                num=num/10;
            }

            System.out.println("Sum of all prime digit number : "+sum);
        }
}
