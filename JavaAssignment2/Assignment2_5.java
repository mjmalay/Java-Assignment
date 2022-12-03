/*5. Write a java program compute following series and take a numbers num as 
input
 x-x3/3! + x5/5!-x7/7!+------+xn/n!
 where x=sum of all even digits except 2 and 8
 and
 n= sum of all odd digits except 1 and 3 */

import java.util.Scanner;
public class Assignment2_5 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int x=0,n=0,num,fact=1,rem,count=0;
        double sum;
        System.out.println("Enter the number: ");
        num=sc.nextInt();
        while (num>0) 
        {
            rem=num%10;
            if (rem%2==0 && rem!=2 && rem!=8) 
            {
               x+=rem;
            }
            else if(rem%2!=0 && rem!=1 && rem!=3)
            {
                n+=rem;
            }
            num/=10;
        }
        sum=x;
        for (int i = n; i>=3; i+=2) 
        {
            for (int j = 1; j <=i; j++) 
            {
                fact*=i;
            }
            count++;
            if (count%2==0) 
            {
                sum+=Math.pow(x, i)/fact;
            }
            else if (count%2!=0) 
            {
                sum-=Math.pow(x, i)/fact;
            }
        }
        System.out.println(sum);
       //stem.out.println("Assignment2_5.main()");      
    }
}