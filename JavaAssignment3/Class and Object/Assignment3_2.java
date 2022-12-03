/*2) Write a program to give information about any number such as whether it is even odd, prime or 
not prime, or positive or negative, palindrome or not using class and object? */


import java.util.*;

class Information
{    

    int num;
    Information(int num)
    {
        this.num=num;
    }
    public void EvenOdd()
    {
        if(num%2==0)
        {
            System.out.println(num+" is even ");
        }
        else{
            System.out.println(num+" is odd");
        }
    }
    public void PrimeOrNot()
    {
        boolean isPrime=false;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                isPrime=true;
                break;
            }
        }
        if (!isPrime){
            System.out.println(num+ " is a prime number ");
        }
        else{
            System.out.println(num + " is not a prime number");
        }
    }

    public void PossitiveNagetive()
    {
        if(num>0)
        {
            System.out.println(num+" is positive number ");
        }
        else{
            System.out.println(num+" is a negative number ");
        }
    }

    public void Palindrome()
    {
        int a,temp,pal=0;
        temp=num;
        while(num>0)
        {
            int r=num%10;
            pal=pal*10+r;
            num=num/10;
        }
        if(temp==pal){
            System.out.println(temp+" is palindrome number");
        }else{
            System.out.println(temp+" is not a palindrome");
        }
    }
}

public class Assignment3_2
{
    public static void main(String[] args) 
    {
        Information in=new Information(151);
        in.EvenOdd();
        in.PrimeOrNot();
        in.PossitiveNagetive();
        in.Palindrome();
    }
}


