/*
 2. Write a java program to find sum of product of corresponding digits of two any digit number Such as n=1234 m=7896 output=6*4+9*3+8*2+7*1

 */

import java.util.Scanner;

class Assignment2_2
{
    public static void main(String[] args) {
        int m,n,sumOfProduct=0,rem1,rem2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two any digit number : ");
        m=sc.nextInt();
        n=sc.nextInt();

        while (m > 0 && n > 0)
        {
            rem1 = m % 10;
            rem2 = n % 10;
            sumOfProduct+=(rem1*rem2);
            m/=10;
            n/=10;
        }
        System.out.println("Sum of product of corresponding digits of two any digit number is "+sumOfProduct);
    }
}