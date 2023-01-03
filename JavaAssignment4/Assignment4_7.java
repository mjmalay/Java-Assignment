/*7.WAP to compute factorial, GCD, LCM, sqrt without using any library function, swap two number 
Without using 3rd variable using multithreading ? */

import java.util.*;
class MyThread extends Thread
{
    String compute;
    Scanner sc=new Scanner(System.in);

    MyThread (String compute)
    {
        this.compute =compute;
    }
    public void run()
    {
        if(compute.equals("factorial"))
        {
            System.out.println("ENter the number to find factorial of that number :");
            double num=sc.nextDouble();
            factorial(num);
        }
        else if(compute.equals("GCD"))
        {
            System.out.println("enter two number to find GCD :");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            FindGCD(num1,num2);
        }
        else if(compute.equals("LCM"))
        {
            System.out.println("ENter two number to find LCM :");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            FindLCM(num1,num2);
        }
        else if(compute.equals("squareroot"))
        {
            System.out.println("ENter a number to find square root of that number: ");
            int num=sc.nextInt();
            FindSquareRoot(num);
        }
        else if(compute.equals("Swap"))
        {
            System.out.println("ENter two number to swap between them :");
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            SwapNumber(x,y);
        }

    }
    
    public void factorial(double num)
    {
        double fact=1;
        if(num==1 || num==0)
        {
            System.out.println("factorial of "+num+" is : 1");
        }else{
            for(int i=1;i<=num;i++)
            {
                fact=fact*i;
            }
            System.out.println("Factorail of "+num+" is :"+fact);
        }
    }
    public void FindGCD(int num1,int num2)
    {
        int gcd=1;
        for(int i=1;i<= num1 && i<=num2;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                gcd=i;
            }
        }
        System.out.println("GCD of "+num1+" & "+num2+" is :"+gcd);

    }
    public void FindLCM(int num1,int num2)
    {
        int lcm;
        lcm=(num1>num2)?num1:num2;
        while(true)
        {
            if(lcm%num1==0 && lcm%num2==0)
            {
                System.out.println("LCM of "+num1+" & "+num2+" = "+lcm);
                break;
            }
            lcm++;
        }
    }
    public void  FindSquareRoot(int num)
    {
        double t;
        double squareroot=num/2;
        do{
            t=squareroot;
            squareroot=(t+(num/t))/2;
        }while(t-squareroot!=0);
        System.out.println("Squareroot of "+num+ "is = "+squareroot);
    }
    public void SwapNumber(int x,int y)
    {
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping the numbers are : "+x+" & "+y);
    }
}

public class Assignment4_7 
{
   public static void main(String[] args) throws Exception {
       MyThread m1=new MyThread("factorial");
       m1.start();
       MyThread m2=new MyThread("squareroot");
       m1.join();
       m2.start();
       MyThread m3=new MyThread("GCD");
       m2.join();
       m3.start();
       MyThread m4=new MyThread("LCM");
       m3.join();
       m4.start();
       MyThread m5=new MyThread("Swap");
       m4.join();
       m5.start();
   } 
}
