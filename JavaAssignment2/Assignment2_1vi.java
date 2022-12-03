/*1. Write a java program to find following using looping and decision making without function
        VI. Find kth digit from front side or back side of any digits number and find its positional value
*/
import java.util.Scanner;
class Assignment2_1vi
{
    public static void main(String[] args) 
    {
        int num,kth,num1 = 0,pos1 = 0 , pos2 = 0;
        int num2= 0,count = 0, total =0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any digit number :");
        num=sc.nextInt();
        num1=num;
        System.out.println("Enter kth number :");
        kth=sc.nextInt();
        
        while(num1 > 0)
        {
            count++;
            if(pos1==0 && count==kth)
            {
                pos1 = num1%10;
            }
            num2 = (num2*10) + (num1%10);
            num1 = num1/10;
        }
                    total = count;
                    count =0;
                    
                    while(num2>0)
                    {
                        count++;
                        if(pos2==0 && count== kth)
                        {
                    
                            pos2 = num2%10;
                        }   
                    num2 = num2/10;
                    }
             System.out.println("Front Side : "+pos2);
            System.out.println("Back Side : "+pos1);
    }   
}




